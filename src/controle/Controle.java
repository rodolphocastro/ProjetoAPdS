package controle;

import dados.Ganho;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import dados.*;
/**
 * Classe responsável por controlar o acesso ao banco de dados
 * @author alvesrc
 */
public class Controle {
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
        sqlCmd = "CREATE TABLE IF NOT EXISTS Despesa (dia integer, mes integer, ano integer, desc varchar(255), valor real, login varchar(25) references Usuario(login), primary key (login, desc, dia, mes, ano))";
        stmt.executeUpdate(sqlCmd);
        
        //Create Table da entidade Ganho
        System.out.println("[DEBUG] Inicializando Ganho...");
        sqlCmd = "CREATE TABLE IF NOT EXISTS Ganho (dia integer, mes integer, ano integer, desc varchar(255), valor real, login varchar(25) references Usuario(login), primary key(dia, mes, ano, desc, login))";
        stmt.executeUpdate(sqlCmd);
        
        System.out.println("[DEBUG] Tabelas inicializadas.");
    }
    
    public void inserirDespesa(Despesa despesa){
        String sql="";
        
        //sql = "INSERT INTO Despesa VALUES("+sql=despesa.gerarSQL()"+)";
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
        String sqlCmd = "INSERT INTO TABLE Ganho VALUES(" + ganho.gerarSQL() + /*user.getLogin()*/ "'arcebus'" + ")";
        try {
            System.err.println(sqlCmd);
            ///Criando o statement
            Statement stmt = c.createStatement();
            //Tentando executar o comando
            stmt.executeUpdate(sqlCmd);
        } catch (Exception err) {
            ErrorHandler.gerarRelatorio(err, Errors.DATABASE_PK_NOT_UNIQUE);
        }
        
        return true;
    }
}
