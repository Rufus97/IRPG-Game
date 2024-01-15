package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Tribunale extends Stanza {
    public Tribunale(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runTribunale() {
        System.out.println("sei in tribunale");
        Menus.menuAction();
    }
}
