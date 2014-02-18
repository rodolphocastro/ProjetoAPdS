package projetoapds;

import controle.Controle;
import controle.Usuario;
import dados.Ganho;
import gui.JanelaInicial;

/**
 * Classe de entrada para o software
 * @author alvesrc
 */
public class ProjetoAPdS {

    public static void main(String[] args) {
        Controle core = new Controle();
        //Rotina de testes
        core.executarRotinaDeTestes();
        Usuario u = new Usuario("arcebus", "Rodolpho", "Alves");
        core.inserirUsuario(u, "senha");
        Ganho g = new Ganho((float) 10.04, "Cobaia", 10, 4, 1993);
        core.inserirGanho(g);
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.setVisible(true);
    }
}
