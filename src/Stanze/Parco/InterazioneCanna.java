package Stanze.Parco;

import Main.GamePanel;
import Player.Oggetto;
import static Stanze.Parco.Brumotti.attivaEventoBrumotti;

public class InterazioneCanna {

    public static void rollaUnaCanna(boolean possiedeErba) {
        System.out.println("Hai scelto di rollare una canna.");

        if (possiedeErba) {
            GamePanel.giocatore.setLivelloSoddisfazione(10);
            GamePanel.giocatore.setHP(-5);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Soddisfazione: " + GamePanel.giocatore.getLivelloSoddisfazione());
            System.out.println("HP attuali: " + GamePanel.giocatore.getHP());
            Oggetto erba = new Oggetto("Erba", 1);
            GamePanel.inventario.rimuoviItem(erba);

            // Evento randomico collegato al punteggio karma
            if (calcolaKarma() < 50) {
                attivaEventoBrumotti();
            }

            possiedeErba = false;
        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }

    private static int calcolaKarma() {
        return 0;
    }
}
