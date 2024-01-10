import Input.In;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Creazione del personaggio
        System.out.print("Inserisci il nome del tuo personaggio: ");
        String nomePersonaggio = In.scanner.nextLine();
        Personaggio giocatore = new Personaggio(nomePersonaggio, 0); // Inizia in posizione 0

        // Creazione dell'inventario
        Inventario inventario = new Inventario();

        // Loop di gioco
        boolean loopGioco = true;
        while (loopGioco) {
            System.out.println("Ti trovi in: " + giocatore.posizione);
            System.out.println("Cosa vuoi fare? (1. Prova , 2. Test, /n Scrivi Quit per uscire)");

            String scelta = In.scanner.nextLine();

            switch (scelta) {
                case "1":
                    // Azione per andare avanti
                    giocatore.posizione=1;
                    break;
                case "2":
                    // Azione per andare indietro
                    giocatore.posizione=2;
                    break;
                case "Quit":
                    // Azione per uscire dal gioco
                    loopGioco = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        System.out.println("Grazie per aver giocato!");
    }
}