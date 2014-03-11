package controle;

import dados.Ganho;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import dados.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe responsável por controlar o acesso ao banco de dados
 * @author alvesrc
 */
public class Controle implements Commons{
    private Connection c;
    private Usuario user;
    
    public Controle(){
        //Lógica para iniciar conexão com a database
        boolean result = inicializar();
        if(!result){
            System.err.println("Ocorreu um erro com a inicialização do programa.");
            System.exit(0);
        }
    }
    
    /**
     * Método para inicializar o controle
     * @return TRUE se não houverem erros, FALSE caso contrário
     */
    private boolean inicializar(){
        System.out.println("[DEBUG] Inicializando a conexão com a database...");
        try{
            //Tentando criar as pastas...
            boolean pathCreated = new File(Commons.PATH_TO_DEFAULT_FOLDER).mkdirs();
            if(!pathCreated){
                System.out.println("[DEBUG] Ocorreu um erro ao criar as pastas.");
            }
            //Inicializando a conexão
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:".concat(Commons.PATH_TO_DATABASE));
            System.out.println("[DEBUG] Conexão estabelecida.");
            //Método para criar tabelas
            criarTabelas();
        }catch(Exception err){
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.DATABASE_NOT_FOUND));
            return false;
        }
        return true;
    }
    
    /**
     * Método para criar tabelas necessárias na database
     * @throws Exception 
     */
    private void criarTabelas() throws Exception{
        System.out.println("[DEBUG] Inicializando tabelas...");
        //Criando o statement
        Statement stmt = c.createStatement();
        String sqlCmd;
        
        //Create table da entidade Usuário.
        System.out.println("[DEBUG] Inicializando Usuario...");
        sqlCmd = "CREATE TABLE IF NOT EXISTS Usuario (login varchar(25), nome varchar(255), sobrenome varchar(255), senha varchar(20), primary key(login))";
        stmt.executeUpdate(sqlCmd);
        
        //Create table da entidade Gastos.
        System.out.println("[DEBUG] Inicializando Despesa...");
        sqlCmd = "CREATE TABLE IF NOT EXISTS Despesa (dia integer, mes integer, ano integer, desc varchar(255), valor real, login varchar(25) REFERENCES Usuario(login), primary key (login, desc, dia, mes, ano))";
        stmt.executeUpdate(sqlCmd);
        
        //Create Table da entidade Ganho
        System.out.println("[DEBUG] Inicializando Ganho...");
        sqlCmd = "CREATE TABLE IF NOT EXISTS Ganho (dia integer, mes integer, ano integer, desc varchar(255), valor real, login varchar(25) REFERENCES Usuario(login), primary key(dia, mes, ano, desc, login))";
        stmt.executeUpdate(sqlCmd);
        stmt.close();
        System.out.println("[DEBUG] Tabelas inicializadas.");
    }
    
    /**
     * Método para inserir uma despesa na database
     * @param despesa a despesa a ser inserida
     * @return TRUE se não houver erros, FALSE caso contrário.
     */
    public boolean inserirDespesa(Despesa despesa){
        //Criando o comando SQL para inserir a despesa
        String sqlCmd = "INSERT INTO DESPESA VALUES(" + despesa.gerarSQL() + " '" + user.getLogin() + "'";
        try{
            //Criando o statement
            Statement stmt = c.createStatement();
            //Tentando executar o comando
            stmt.executeUpdate(sqlCmd);
            stmt.close();
        }catch(Exception err){
            //em caso de erro, informar o erro.
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.DATABASE_PK_NOT_UNIQUE));
            return false;
        }
        return true;
    }
    
    /**
     * Função para imprimir algumas variáveis do sistema na tela e executar simples testes
     */
    public void executarRotinaDeTestes(){
        System.out.println("---Iniciando Rotina de Testes---");
        System.out.println("Sistema: " + controle.Commons.OS);
        System.out.println("Arquivo de Opções: " + controle.Commons.PATH_TO_OPTIONS);
        System.out.println("Arquivo da Database: " + controle.Commons.PATH_TO_DATABASE);
        System.out.println("---Fim da Rotina de Teste---");
    }
    
    /**
     * Método para inserir um ganho na database
     * @param ganho o ganho a ser inserido
     * @return TRUE se não houver erros. FALSE caso contrário.
     */
    public boolean inserirGanho(Ganho ganho){
        //Criando o comando SQL para inserir
        String sqlCmd = "INSERT INTO Ganho VALUES(" + ganho.gerarSQL() + " '" + user.getLogin() + "')";
        try {
            ///Criando o statement
            Statement stmt = c.createStatement();
            //Tentando executar o comando
            stmt.executeUpdate(sqlCmd);
            stmt.close();
        } catch (Exception err) {
            //Log mais detalhado para o erro.
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.DATABASE_PK_NOT_UNIQUE));
            //Janela mais simples para o usuário.
            JOptionPane.showMessageDialog(null, "Os dados informados já estão cadastrados no sistema.");
            return false;
        }
        
        return true;
    }
    
    /**
     * Método para inserir um usuário na database
     * @param usuario O usuário a ser inserido
     * @param pswd A senha do usuário a ser inserido
     * @return TRUE caso execute sem erros, FALSE caso contrário.
     */
    public boolean inserirUsuario(Usuario usuario, String pswd){
        String sqlCmd = "INSERT INTO USUARIO VALUES(" + usuario.gerarSQL() + "'" + pswd +"')";
        //System.err.println(sqlCmd);
        try{
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sqlCmd);
            stmt.close();
        }catch(SQLException err){
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.DATABASE_PK_NOT_UNIQUE));
            return false;
        }
        return true;
    }
    
    /**
     * Função para validar o login de um usuário no sistema.
     * @param login o login do usuário
     * @param pswd a senha do usuário
     * @return TRUE se o usuário for validado com sucesso, FALSE caso contrário.
     */
    public boolean validarUsuario(String login, String pswd){
        user = buscarUsuario(login);
        if(user.getLogin().compareToIgnoreCase("notfound")!=0){
            //Login é válido, validar a senha.
            if(user.getPswd().compareToIgnoreCase(pswd)==0){
                //User é valido
                return true;
            }
        }
        return false;
    }
    
    /**
     * Método para buscar um usuário na database
     * @param login o login do usuário buscado
     * @return O usuário encontrado.
     */
    private Usuario buscarUsuario(String login){
        Usuario us = new Usuario("NOTFOUND", "NOTFOUND", "NOTFOUND");
        us.setPswd("NOTFOUND");
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO WHERE login = '" + login + "'");
            String nome, sNome, pswd;
            nome = rs.getString("nome");
            sNome = rs.getString("sobrenome");
            pswd = rs.getString("senha");
            us = new Usuario(login, nome, sNome);
            us.setPswd(pswd);
            rs.close();
            stmt.close();
        }catch(Exception err){
            //@todo Criar novo código de erro para quando resultSet for inválido
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.UNKNOWN_ERROR));
        }
        return us;
    }
    
    /**
     * Método para buscar um ganho específico na database
     * @param dia o dia do ganho a ser buscado
     * @param mes o mes do ganho a ser buscado
     * @param ano o ano do ganho a ser buscado
     * @param desc a descrição do ganho a ser buscado
     * @return O resultado da consulta na database
     */
    private Ganho buscarGanho(int dia, int mes, int ano, String desc){
        Ganho gain = new Ganho(-1,"NOTFOUND",0,0,0);
        
        try{
            Statement stmt = c.createStatement();
            //dia,mes,ano,desc,login
            ResultSet rs = stmt.executeQuery("SELECT * FROM GANHO WHERE dia='" + dia + "' and mes = '" + mes + "' and ano = '" + ano + "' and desc = '" + desc + "' and login = '" + user.getLogin() + "'");
            
            float valor;
            
            valor = rs.getFloat("valor");
            gain = new Ganho(valor, desc, dia, mes, ano);
            
            rs.close();
            stmt.close();
            
        }catch(Exception err){
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.DATABASE_PK_NOT_UNIQUE));
        }
        return gain;
    }
    
    /**
     * Método para buscar uma despesa específica na database
     * @param dia o dia da despesa a ser buscada
     * @param mes o mes da despesa a ser buscada
     * @param ano o ano da despesa a ser buscada
     * @param desc a descrição da despesa a ser buscada
     * @return O resultado da consulta na database
     */
    private Despesa buscarDespesa(int dia, int mes, int ano, String desc){
        Despesa loss = new Despesa(-1, "NOTFOUND", 0, 0, 0);
        
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DESPESA WHERE dia = '" + dia + "'and mes = '" + mes + "' and ano = '" + ano + "'and desc = '" + desc + "' and login = '" + user.getLogin() + "'");
            
            float valor = rs.getFloat("valor");
            
            loss = new Despesa(valor, desc, dia, mes, ano);
            rs.close();
            stmt.close();
        }catch(Exception err){
            //@todo Criar novo código de erro para quando resultSet for inválido.
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.UNKNOWN_ERROR));
        }
        
        return loss;
    }

    /**
     * Método para retornar todas as despesas de um usuário na databse
     * @return ArrayList contendo todas as despesas encontradas
     */
    private ArrayList<Despesa> buscarDespesasDoUsuario(){
        //@todo Testar o método de buscarDespesasDoUsuario
        ArrayList<Despesa> resultDesp = new ArrayList<>();
        try{
            Statement stmt = c.createStatement();
            //Selecionando todas as despesas do login do usuário.
            String sqlCmd = "SELECT * FROM DESPESA WHERE login = '" + user.getLogin() + "'";
            ResultSet rs = stmt.executeQuery(sqlCmd);
            while(rs.next()){
                String desc = rs.getString("desc");
                int dia = rs.getInt("dia"), mes = rs.getInt("mes"), ano = rs.getInt("ano");
                float valor = rs.getFloat("valor");
                resultDesp.add(new Despesa(valor, desc, dia, mes, ano));
            }
            rs.close();
            stmt.close();
        }catch(Exception err){
            //@todo Criar novo código de erro para quando resultSet for inválido.
            System.err.println(ErrorHandler.gerarRelatorio(err, Errors.UNKNOWN_ERROR));
        }
        return resultDesp;
    }
}
