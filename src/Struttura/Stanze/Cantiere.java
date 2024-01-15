package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Cantiere extends Stanza {
    public Cantiere(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runCantiere(){
        System.out.println("Benvenuto nel cantire");
        Menus.menuAction();
        // TODO
    }
}
