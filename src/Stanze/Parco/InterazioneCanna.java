package Stanze.Parco;

import Main.GamePanel;
import Player.Personaggio;
import Player.Oggetto;
import static Stanze.Parco.Brumotti.attivaEventoBrumotti;

public class InterazioneCanna {

    public static void rollaUnaCanna( boolean possiedeErba) {
        System.out.println("Hai scelto di rollare una canna.");

        if (possiedeErba) {
            GamePanel.giocatore.setLivelloSoddisfazione(10);
            GamePanel.giocatore.setHP(-5);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Soddisfazione: " + GamePanel.giocatore.getLivelloSoddisfazione());
            System.out.println("HP attuali: " + GamePanel.giocatore.getHP());

            // Evento randomico collegato al punteggio karma
            if (GamePanel.giocatore.getKarma() < 0) {
                attivaEventoBrumotti(GamePanel.giocatore);
            }

            possiedeErba = false;
        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }

}
