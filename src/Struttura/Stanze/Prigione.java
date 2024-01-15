package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

public class Prigione extends Stanza {
    public Prigione(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runPrigione() {
        System.out.println("Sei finito in prigione");
        Menus.menuAction();
        //TODO
    }
}
