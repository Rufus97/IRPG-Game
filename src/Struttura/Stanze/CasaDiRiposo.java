package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class CasaDiRiposo extends Stanza {
    public CasaDiRiposo(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runCasaDiRiposo(){
        System.out.println("Benvenuto nella casa di riposo");
        Menus.menuAction();
        // TODO
    }
}
