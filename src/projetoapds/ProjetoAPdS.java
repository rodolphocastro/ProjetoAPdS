package projetoapds;

import controle.Controle;
import gui.JanelaInicial;

/**
 * Classe de entrada para o software
 * @author alvesrc
 */
public class ProjetoAPdS {

    public static void main(String[] args) {
        //Criando o core do programa
        Controle core = new Controle();
        //Criando a janela inicial
        JanelaInicial janelaInicial = new JanelaInicial();
        //Passando o core para a nova janela
        janelaInicial.setCore(core);
        //Definindo a janela como visivel
        janelaInicial.setVisible(true);
        
    }
}
