package controle;

/**
 * Interface contendo os códigos de erros que podem aparecer durante a execução do programa.
 * @author ALVES, R.C.
 */
public interface Errors {
    /**
     * Código de erro para quando a database não é encontrada
     */
    public static final int DATABASE_NOT_FOUND = 401;
    
    /**
     * Descrição para o erro de database not found
     */
    public static final String DATABASE_NOT_FOUND_DESC = "O arquivo database.db não foi encontrado na pasta " + Commons.PATH_TO_DATABASE + ".";
    
    /**
     * Código de erro para quando o arquivo de opções não é encontrado.
     */
    public static final int OPTIONS_NOT_FOUND = 301;
    
    /**
     * Descrição para o erro de options not found
     */
    public static final String OPTIONS_NOT_FOUND_DESC = "O arquivo options.txt não foi encontrado na pasta " + Commons.PATH_TO_OPTIONS + ".";
    
    /**
     * Código de erro para quando a biblioteca sqlite não foi encontrada,
     */
    public static final int SQLITE_LIBRARY_NOT_FOUND = 201;
    
    /**
     * Descrição para o erro de sqlite library not found
     */
    public static final String SQLITE_LIBRARY_NOT_FOUND_DESC = "A biblioteca SQLITE não foi encontrada.";
    
    /**
     * Código de erro para quando a chave inserida viola a unicidade da PrimaryKey
     */
    public static final int SQLITE_PK_NOT_UNIQUE = 202;
    
    /**
     * Descrição para o erro do sqlite pk not unique
     */
    public static final String SQLITE_PK_NOT_UNIQUE_DESC = "A chave inserida não já está registrada na DATABASE.";
}
