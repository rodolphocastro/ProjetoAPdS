package projetoapds;

import controle.Controle;
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
        
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.setVisible(true);
    }
}
