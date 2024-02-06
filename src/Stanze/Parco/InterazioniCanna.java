package Stanze;

import Player.Personaggio;

public class InterazioneCanna {

    public static void rollaUnaCanna(Personaggio personaggio) {
        System.out.println("Hai scelto di rollare una canna.");

        if (possiedeErba) {
            personaggio.incrementaPuntiSoddisfazione(10);
            personaggio.decrementaHP(5);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Soddisfazione: " + personaggio.getLivelloSoddisfazione());
            System.out.println("HP attuali: " + personaggio.getHP());

            // Evento randomico collegato al punteggio karma
            if (calcolaKarma(personaggio) > 0.5) {
                attivaEventoBrumotti(personaggio);
            }

            possiedeErba = false;
        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }
}
