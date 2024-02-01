package Stanze;

import Input.In;
import Player.Personaggio;
import Player.Inventario;
import Player.Oggetto;

public class Parco {

    private boolean possiedeErba;
    private Personaggio personaggio;
    private Inventario inventario;

    public Parco(Personaggio personaggio, Inventario inventario) {
        this.possiedeErba = false;
        this.personaggio = personaggio;
        this.inventario = inventario;
    }

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
        Oggetto erba = new Oggetto("Erba", 1);

        if (inventario.controllaItem(erba)) {
            System.out.println("Hai già dell'erba nell'inventario.");
        } else {
            int prezzoErba = 12;

            // Supponiamo che il giocatore abbia un attributo "soldi" nella classe Personaggio
            if (personaggio.getSoldi() >= prezzoErba) {
                // Riduci i soldi del giocatore del prezzo dell'erba
                personaggio.decrementaSoldi(prezzoErba);
                // Aggiungi l'erba all'inventario
                inventario.aggiungiItem(erba);
                System.out.println("Hai acquistato dell'erba da Aziz.");
            } else {
                System.out.println("Non hai abbastanza soldi per comprare l'erba.");
            }
        }
    }

    private static void rollaUnaCanna() {
        Oggetto erba = new Oggetto("Erba", 1);

        if (inventario.controllaItem(erba)) {


            personaggio.incrementaPuntiSballo(10);
            personaggio.incrementaPuntiSoddisfazione(10);
            personaggio.decrementaHP(5);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Sballo: " + personaggio.getPuntiSballo());
            System.out.println("Punti Soddisfazione: " + personaggio.getPuntiSoddisfazione());
            System.out.println("HP attuali: " + personaggio.getHP());


            inventario.rimuoviItem(erba);
        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }

    private static void attivaEventoBrumotti(Personaggio personaggio) {
        System.out.println("Oh no! In lontananza senti strillare: ABBOMBAZZA AMICI DI STRISCIA, Brumotti fa la sua comparsa!");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Minaccia Brumotti fingendo di telefonare al Brasiliano");
        System.out.println("2. Cerca di fuggire");
        System.out.println("3. Cerchi lo scondro e attacchi Brumotti");

        int sceltaAzione = In.inputInt();

        switch (sceltaAzione) {
            case 1:
                minacciaBrumotti(personaggio);
                break;
            case 2:
                cercaDiFuggireDaBrumotti(personaggio);
                break;
            case 3:
                cercaScontroConBrumotti(personaggio);
                break;
            default:
                System.out.println("Scelta non valida. Brumotti ti sta addosso...");
        }
    }

    private static void minacciaBrumotti(Personaggio personaggio) {
        System.out.println("Decidi di telefonare al Brasiliano...");

        personaggio.setSoddisfazione(personaggio.getLivelloSoddisfazione() + 5);

        System.out.println("Brumotti capisce che non deve darti noia. Il tuo karma aumenta!");
        System.out.println("Nuovo punteggio Soddisfazione: " + personaggio.getLivelloSoddisfazione());
    }

    private static void cercaDiFuggireDaBrumotti(Personaggio personaggio) {
        System.out.println("Decidi di cercare di fuggire da Brumotti...");

        personaggio.setKarma(personaggio.getKarma() - 10);

        System.out.println("Brumotti ti afferra il braccio e ti blocca la fuga. Il tuo karma diminuisce!");
        System.out.println("Nuovo punteggio Karma: " + personaggio.getKarma());
    }

    private static void cercaScontroConBrumotti(Personaggio personaggio) {
        System.out.println("Decidi di cercare uno scontro con Brumotti per dargli una lezione");

        personaggio.incrementaSoddisfazione(10);
        personaggio.decrementaKarma(20);

        System.out.println("Inizi uno scontro con Brumotti!");

        // Risoluzione dello scontro
        int risultatoScontro = risolviScontroConBrumotti(personaggio);

        if (risultatoScontro > 0) {
            System.out.println("Hai sconfitto Brumotti! Il tuo karma diminuisce ma gli fai fuori la bici.");
        } else {
            System.out.println("Brumotti ti ha sconfitto! Arriva il Gabibbo con le guardie. Vieni arrestato: perdi HP, soddisfazione e i tuoi oggetti vengono confiscati.");

            // Simula l'arresto e la prigione
            personaggio.setHP(0);  // Imposta HP a 0
            personaggio.decrementaSoddisfazione(20);
            personaggio.svuotaInventario();
            personaggio.finisciInTribunale();
        }


        private static void rubaBiciclettaBrumotti (Personaggio personaggio){

            Oggetto bicicletta = new Oggetto("Bicicletta", 1);

            // Aggiungi la bicicletta all'inventario del giocatore
            personaggio.aggiungiAllInventario(bicicletta);

            System.out.println("Hai rubato la bicicletta di Brumotti! Ora è nel tuo inventario. ABBOMBAZZA!");
        }
    }

}



