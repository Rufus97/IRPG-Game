import Input.In;

public class LoopGioco {
    public static void avviaGioco() {
        // Creazione del personaggio
        Personaggio personaggio = new Personaggio();
        // Creazione dell'inventario
        boolean loopGioco = true;
        if (personaggio.getPosizione() == 0) {
            while (loopGioco) {
                System.out.println("Ti trovi in: " + personaggio.getPosizione());
                System.out.println("Cosa vuoi fare? (1. Prova , 2. Test, Scrivi Quit per uscire)");

                //Scelta movimento
                String scelta = In.scanner.nextLine();
                switch (scelta.toLowerCase()) {
                    case "1":
                        personaggio.setPosizione(1);
                        break;
                    case "2":
                        personaggio.setPosizione(2);
                        break;
                    case "quit":
                        // Azione per uscire dal gioco
                        loopGioco = false;
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                }
            }
        }else {loopGioco = false;}
        // Loop di gioco
        System.out.println("Grazie per aver giocato!");
    }
}
