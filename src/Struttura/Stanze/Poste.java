package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Poste extends Stanza {
    public Poste(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runPoste() {
        System.out.println("Benvenuto alle poste");
        Menus.menuAction();
        //TODO
    }
}
