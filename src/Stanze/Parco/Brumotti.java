package Stanze.Parco;
import Input.In;
import Main.GamePanel;
import Player.Personaggio;
import Player.Oggetto;

public class Brumotti {

    public static void attivaEventoBrumotti(Personaggio personaggio) {
        System.out.println("Oh no! In lontananza senti strillare: ABBOMBAZZA AMICI DI STRISCIA, Brumotti fa la sua comparsa!");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Minaccia Brumotti fingendo di telefonare al Brasiliano");
        System.out.println("2. Cerca di fuggire");
        System.out.println("3. Cerchi lo scontro e attacchi Brumotti");

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

        GamePanel.giocatore.setLivelloSoddisfazione(5);

        System.out.println("Brumotti capisce che non deve darti noia. Il tuo karma aumenta!");
        System.out.println("Nuovo punteggio Soddisfazione: " + personaggio.getLivelloSoddisfazione());
    }

    private static void cercaDiFuggireDaBrumotti(Personaggio personaggio) {
        System.out.println("Decidi di cercare di fuggire da Brumotti...");

        GamePanel.giocatore.setKarma(10);

        System.out.println("Brumotti ti afferra il braccio e ti blocca la fuga. Il tuo karma diminuisce!");
        System.out.println("Nuovo punteggio Karma: " + personaggio.getKarma());
    }

    private static void cercaScontroConBrumotti(Personaggio personaggio) {
        System.out.println("Decidi di cercare uno scontro con Brumotti per dargli una lezione");

        GamePanel.giocatore.setLivelloSoddisfazione(10);
        GamePanel.giocatore.setKarma(-20);

        System.out.println("Inizi uno scontro con Brumotti!");

        // Risoluzione dello scontro
        int risultatoScontro = risolviScontroConBrumotti(personaggio);

        if (risultatoScontro > 0) {
            rubaBiciclettaBrumotti(personaggio);
            System.out.println("Hai sconfitto Brumotti! Il tuo karma diminuisce ma te la sei scampata.");
        } else {
            System.out.println("Brumotti ti ha sconfitto! Arriva il Gabibbo con le guardie. Vieni arrestato: perdi HP, soddisfazione e i tuoi oggetti vengono confiscati.");
            GamePanel.inventario.svuotaInventario();
        }
        System.out.println("Nuovo punteggio Karma: " + personaggio.getKarma());
    }

    private static int risolviScontroConBrumotti(Personaggio personaggio) {
        // Implementa la logica per la risoluzione dello scontro
        return 0;
    }

    private static void rubaBiciclettaBrumotti(Personaggio personaggio) {
        Oggetto bicicletta = new Oggetto("Bicicletta", 1);
        GamePanel.inventario.aggiungiItem(bicicletta);

        System.out.println("Hai rubato la bicicletta di Brumotti! Ora è nel tuo inventario. ABBOMBAZZA!");
    }
}