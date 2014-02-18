package controle;

/**
 * Interface contendo constantes necessárias para o funcionamento do sistema.
 * @author ALVES, R.C.
 */
public interface Commons {
    /**
     * Caminho para o arquivo database.db que se localiza na pasta do usuário.
     */
    public static final String PATH_TO_DATABASE = System.getProperty("user.home").concat("\\SGF2014\\database.db");
    
    /**
     * Caminho para o arquivo options.txt que se localiza na pasta do usuário.
     */
    public static final String PATH_TO_OPTIONS = System.getProperty("user.home").concat("\\SGF2014\\options.txt");
    
    /**
     * Sistema operacional do usuário.
     */
    public static final String OS = System.getProperty("os.name");
    
    /**
     * Pasta em que o programa ficará instalado
     */
    public static final String PATH_TO_DEFAULT_FOLDER = System.getProperty("user.home").concat("\\SGF2014\\");
}
