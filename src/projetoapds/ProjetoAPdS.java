package projetoapds;

import controle.Controle;
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
        Ganho gg = new Ganho((float) 10.01, "Cobaia", 10, 04, 1993);
        core.inserirGanho(gg);
        
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.setVisible(true);
    }
}
