package controle;

import dados.Gasto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Classe responsável por controlar o acesso ao banco de dados
 * @author alvesrc
 */
public class Controle {
    private Connection c;
    
    public Controle(){
        //Lógica para iniciar conexão com a database
        boolean result = inicializar();
        if(!result){
            
        }
    }
    
    /**
     * Método para inicializar o controle
     * @return TRUE se não houverem erros, FALSE caso contrário
     */
    private boolean inicializar(){
        System.out.println("[DEBUG] Inicializando a conexão com a database...");
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:".concat(Commons.PATH_TO_DATABASE));
            System.out.println("[DEBUG] Conexão estabelecida.");
            
            //Método para criar tabelas
            criarTabelas();
        }catch(Exception err){
            System.err.println(err.getClass().toString() + err.getMessage());
            return false;
        }
        return true;
    }
    
    
    private void criarTabelas() throws Exception{
        System.out.println("[DEBUG] Inicializando tabelas...");
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
        
        //PROFIT
        System.out.println("[DEBUG] Tabelas inicializadas.");
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
     * Método para inserir uma tupla na tabela gastos do banco de dados
     * @param gasto O gasto a ser inserido
     * @return TRUE se não houver erro, FALSE caso contrário
     */
    public boolean inserirGasto(Gasto gasto){
        return true;
    }
}
