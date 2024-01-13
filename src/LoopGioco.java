import Input.In;
import Stanze.Tabacchino;

public class LoopGioco {
    public static void avviaGioco() {
        // Creazione del personaggio
        Personaggio personaggio = new Personaggio();
        //creazione tabacchino
        Tabacchino tabacchino = new Tabacchino();
        
        // Creazione dell'inventario
        boolean loopGioco = true;

        //Start loop di gioco


        while (loopGioco) {
            System.out.println("Ti trovi in: " + personaggio.getPosizione());


            // Controlla la posizione del personaggio e esegui azioni specifiche della stanza
            switch (personaggio.getPosizione()) {
                case 0:
                    //Switch per definire la nuova posizione
                    System.out.println("Cosa vuoi fare? (1. Prova , 2. Vai al tabacchino, Scrivi Quit per uscire)");
                    String scelta = In.scanner.nextLine();
                    switch (scelta.toLowerCase()) {
                        case "1":
                            personaggio.setPosizione(1);
                            break;
                        case "2":
                            tabacchino.gioca10eLotto();
                            break;
                        case "quit":
                            // Azione per uscire dal gioco
                            loopGioco = false;
                            break;
                        default:
                            System.out.println("Scelta non valida. Riprova.");
                    }
                    break;
                case 1:
                    System.out.println("Sito n°1 ancora in costruzione! ritornare più tardi");
                    loopGioco = false;
                    break;
                case 2:
                    System.out.println("Sito n°2 ancora in costruzione! ritornare più tardi");
                    loopGioco = false;
                    break;
                default:
                    System.out.println("Posizione non gestita.");
                    loopGioco = false;  // Esci dal loop in caso di posizione non gestita

            }
        }


        // Loop di gioco
        System.out.println("Grazie per aver giocato!");
    }
}
