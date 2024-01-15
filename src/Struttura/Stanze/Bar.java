package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Bar extends Stanza {
    public Bar(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runBar(){
        System.out.println("Benvenuto nel bar");
        Menus.menuAction();
        // TODO

    }
}
