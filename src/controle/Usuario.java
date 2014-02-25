package controle;

/**
 *
 * @author alvesrc
 */
public class Usuario {
    private final String login;
    private final String nome, sNome;
    private String pswd;
    
    public Usuario(String login, String nome, String sNome) {
        this.login = login;
        this.nome = nome;
        this.sNome = sNome;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getsNome() {
        return sNome;
    }
    
    public String gerarSQL(){
        String sql = "";
        sql = "'" + this.login + "', '" + this.nome +"', '" + this.sNome + "', ";
        return sql;
    }
    
    public void setPswd(String pswd){
        this.pswd = pswd;
    }
    
    public String getPswd(){
        return pswd;
    }
}
