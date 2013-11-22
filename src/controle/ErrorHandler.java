package controle;

/**
 * Classe responsável por lidar com erros, emitir relatórios e erros e impedir maiores danos.
 * @author ALVES, R.C.
 */
public class ErrorHandler implements Errors{
    
    public static String gerarRelatório(Exception err, int codErro){
        String report = "";
        //Pegando dados do sistema
        report = report.concat("Sistema Operacional: " + Commons.OS + "\n");
        report = report.concat("Caminho para as opções: " + Commons.PATH_TO_OPTIONS + "\n");
        report = report.concat("Caminho para a database: " + Commons.PATH_TO_DATABASE + "\n");
        switch(codErro){
            //Database não encontrada
            case(DATABASE_NOT_FOUND):
                report = report.concat(gerarDescErro(DATABASE_NOT_FOUND, DATABASE_NOT_FOUND_DESC));
                break;
        }
        report = report.concat("Java Error: " + err.getClass().getName() + ": " +  err.getMessage());
        return report;
    }
    
    private static String gerarDescErro(int codErro, String descErro){
        String desc = "";
        desc = desc.concat("Código: " + Integer.toString(codErro) + "\n"+ "Descrição: " + descErro + "\n");
        return desc;
    }
}
