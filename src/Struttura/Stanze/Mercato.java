package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Mercato extends Stanza {
    public Mercato(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runMercato() {
        System.out.println("Benvenuto al mercato");
        Menus.menuAction();
        //TODO
    }
}
