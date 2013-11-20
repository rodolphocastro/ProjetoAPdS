package projetoapds;

import controle.Controle;

/**
 * Classe de entrada para o software
 * @author alvesrc
 */
public class ProjetoAPdS {

    public static void main(String[] args) {
        Controle core = new Controle();
        //Rotina de testes
        core.executarRotinaDeTestes();
    }
}
