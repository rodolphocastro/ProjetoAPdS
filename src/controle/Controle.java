package controle;

import java.sql.Connection;

/**
 * Classe responsável por controlar o acesso ao banco de dados
 * @author alvesrc
 */
public class Controle {
    private Connection c;
    
    public Controle(){
        //Lógica para iniciar conexão com a database
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
}
