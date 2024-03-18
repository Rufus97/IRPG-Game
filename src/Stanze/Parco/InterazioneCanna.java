package Stanze.Parco;

import Main.GamePanel;
import Player.Oggetto;

public class InterazioneCanna {
    public InterazioneCanna() {
    }

    public static void rollaUnaCanna(boolean b) {
        Oggetto erba = new Oggetto("Erba", 1);
        if (GamePanel.inventario.contieneItem(erba)) {
            System.out.println("Hai scelto di rollare una canna.");
            GamePanel.giocatore.setLivelloSoddisfazione(10.0);
            GamePanel.giocatore.setHP(-5);
            System.out.println("Rolli un cannone e lo accendi! Stai tutto fattoooo!");
            System.out.println("Punti Soddisfazione: " + GamePanel.giocatore.getLivelloSoddisfazione());
            System.out.println("HP attuali: " + GamePanel.giocatore.getHP());
            GamePanel.inventario.rimuoviItem(erba);
            if (calcolaKarma() < 50) {
                Brumotti.attivaEventoBrumotti();
            }
        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }

    private static int calcolaKarma() {
        return 0; // Implementa il calcolo del karma
    }
}

