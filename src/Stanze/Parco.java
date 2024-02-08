
/*
package Stanze;
import Input.In;


public class Parco {



    public static void runParco() {
        System.out.println("Benvenuto al parchetto di Tor bella Monaca");
        boolean continua = true;

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Leggi il giornale sulla panchina");
            System.out.println("2. Approccia Aziz");
            System.out.println("3. Rolla una canna");
            System.out.println("4. Vai via dal parco");

            int sceltaAzione = In.inputInt();

            switch (sceltaAzione) {
                case 1:
                    leggiIlGiornale();
                    break;
                case 2:
                    approcciaLoSpacciatore();
                    break;
                case 3:
                    rollaUnaCanna();
                    break;
                case 4:
                    System.out.println("Hai scelto di uscire dal parco.");
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    private static void approcciaLoSpacciatore() {
        System.out.println("Hai scelto di approcciare Aziz.");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Acquista erba");
        System.out.println("2. Lascia perdere");

        int sceltaAzione = In.inputInt();

        switch (sceltaAzione) {
            case 1:
                acquistaErba();
                break;
            case 2:
                System.out.println("Hai deciso di lasciar perdere.");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
        }
    }

    private static void acquistaErba() {
        int prezzoErba = 12;
        boolean possiedeErba = false;

        if (possiedeErba) {
            System.out.println("Hai già dell'erba nell'inventario.");
        } else {
            // Supponiamo che il giocatore abbia un attributo "soldi" nella classe Personaggio
            if (personaggio.getSoldi() >= prezzoErba) {
                // Riduci i soldi del giocatore del prezzo dell'erba
                personaggio.decrementaSoldi(prezzoErba);
                // Imposta possiedeErba a true, indicando che il giocatore ha acquistato l'erba
                possiedeErba = true;
                System.out.println("Hai acquistato dell'erba da Aziz.");
            } else {
                System.out.println("Non hai abbastanza soldi per comprare l'erba.");
            }
        }
    }

    private static void rollaUnaCanna() {
        System.out.println("Hai scelto di rollare una canna.");

        if (possiedeErba) {
            // Supponiamo che il rollare una canna aggiunga 10 punti sballo,
            // 10 punti soddisfazione e sottragga 5 punti vita (HP)
            personaggio.incrementaPuntiSballo(10);
            personaggio.incrementaPuntiSoddisfazione(10);
            personaggio.decrementaHP(5);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Sballo: " + personaggio.getPuntiSballo());
            System.out.println("Punti Soddisfazione: " + personaggio.getPuntiSoddisfazione());
            System.out.println("HP attuali: " + personaggio.getHP());

            // Evento randomico collegato al punteggio karma
            if (calcolaKarma(personaggio) > 0.5) {
                attivaEventoBrumotti(personaggio);
            }

            // Rimuovi l'erba dall'inventario
            possiedeErba = false;
        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }
}
*/