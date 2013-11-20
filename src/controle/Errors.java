package controle;

/**
 * Interface contendo os códigos de erros que podem aparecer durante a execução do programa.
 * @author ALVES, R.C.
 */
public interface Errors {
    /**
     * Código de erro para quando a database não é encontrada
     */
    public static final int DATABASE_NOT_FOUND = 404;
    
    /**
     * Descrição para o erro de database not found
     */
    public static final String DATABASE_NOT_FOUND_DESC = "O arquivo database.db não foi encontrado na pasta " + Commons.PATH_TO_DATABASE + ".";
    
    /**
     * Código de erro para quando o arquivo de opções não é encontrado.
     */
    public static final int OPTIONS_NOT_FOUND = 304;
    
    /**
     * Descrição para o erro de options not found
     */
    public static final String OPTIONS_NOT_FOUND_DESC = "O arquivo options.txt não foi encontrado na pasta " + Commons.PATH_TO_OPTIONS + ".";
    
    /**
     * Código de erro para quando a biblioteca sqlite não foi encontrada,
     */
    public static final int SQLITE_LIBRARY_NOT_FOUND = 204;
    
    /**
     * Descrição para o erro de sqlite library not found
     */
    public static final String SQLITE_LIBRARY_NOT_FOUND_DESC = "A biblioteca SQLITE não foi encontrada.";
}
