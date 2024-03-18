package Stanze;

import Input.In;
import Main.GamePanel;
import Main.Menu;

public class Questura implements Stanza {

    public static void runQuestura() {
    }

    @Override
    public void runStanza() {
        System.out.println("Benvenuto in questura. Sei stato arrestato!");
        boolean continua = true;

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Guardati intorno");
            System.out.println("2. Parla con il maresciallo");
            System.out.println("3. Chiama l'avvocato");
            System.out.println("4. Tenta la fuga");
            System.out.println("0. Torna al menu principale");

            int sceltaAzione = In.inputInt();

            switch (sceltaAzione) {
                case 1:
                    guardatiIntorno();
                    break;
                case 2:
                    parlaConMaresciallo();
                    break;
                case 3:
                    chiamaAvvocato();
                    break;
                case 4:
                    tentaLaFuga();
                    break;
                case 0:
                    tornaAlMenuPrincipale();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    private void guardatiIntorno() {
        System.out.println("Ti guardi intorno e vedi un telefono.");
        GamePanel.giocatore.setHP(GamePanel.giocatore.getHP() - 5);
        System.out.println("Il telefono è a portata di mano, ma potrebbe essere rischioso usarlo.");
    }

    private void parlaConMaresciallo() {
        System.out.println("Parli con il maresciallo, ma non sembra molto disponibile a rispondere alle tue domande.");
    }

    private void chiamaAvvocato() {
        System.out.println("Chiedi alla guardia di poter fare una telefonata. Decidi di chiamare l'avvocato.");
        System.out.println("Il telefono squilla e senti la voce dell'avvocato Diprè che ti dice di stare tranquillo e che pagherà la cauzione.");
        GamePanel.giocatore.setSoldi(GamePanel.giocatore.getSoldi() - 500); // Sottrai 500 euro dai soldi del giocatore
        System.out.println("Ti vengono scalati 500 euro, ma almeno torni a piede libero.");
        tornaAlMenuPrincipale();
    }

    private void tentaLaFuga() {
        System.out.println("Decidi di tentare di fuggire.");
        GamePanel.giocatore.setHP(GamePanel.giocatore.getHP() - 10);
        System.out.println("Una guardia ti colpisce con un manganellata nello stomaco. Perdi 10 HP.");
    }

    private void tornaAlMenuPrincipale() {
        System.out.println("Torni al menu principale.");
        Menu menu = new Menu();
        menu.VaiA();
    }

    @Override
    public String getNomeStanza() {
        return "Qvestvra";
    }
}




