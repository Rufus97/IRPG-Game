package Struttura.Stanze;

import GamePlay.Menus.Menus;
import Struttura.Stanze.Stanza.Stanza;

// Work in progress
public class PuntoSNAI extends Stanza {

    public PuntoSNAI(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public static void runPuntoSNAI() {
        System.out.println("Benvenuto al punto SNAI");
        Menus.menuAction();
        //TODO
    }
}
