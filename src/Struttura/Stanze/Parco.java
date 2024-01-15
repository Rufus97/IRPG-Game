package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Parco extends Stanza {
    public Parco(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runParco() {
        System.out.println("Benvenuto al parco");
        Menus.menuAction();
        //TODO
    }
}
