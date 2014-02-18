package controle;

/**
 *
 * @author alvesrc
 */
public class Usuario {
    private String login;
    private String nome, sNome;

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
    
    
    
}
