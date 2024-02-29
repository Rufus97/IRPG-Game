package Stanze;

import Input.In;
import Main.GamePanel;
import Main.Menu;
import Player.Personaggio;

public class Questura {

    public static void runQuestura() {
        System.out.println("Sei finito dentro!");
        boolean continua = true;

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Guardati intorno");
            System.out.println("2. Parla con il maresciallo");
            System.out.println("3. Chiama l'avvocato");
            System.out.println("4. Tenta la fuga");

            int sceltaAzione = In.inputInt();
            Questura questura = new Questura();

            switch (sceltaAzione) {
                case 1:
                    questura.guardatiIntorno();
                    break;
                case 2:
                    questura.parlaConMaresciallo();
                    break;
                case 3:
                    questura.chiamaAvvocato();
                    break;
                case 4:
                    questura.tentaLaFuga();
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

        // Ritorna al menu principale
        Menu.VaiA();


    }

    private void tentaLaFuga() {
        System.out.println("Decidi di tentare di fuggire.");
        GamePanel.giocatore.setHP(GamePanel.giocatore.getHP() - 10);
        System.out.println("Una guardia ti colpisce con un manganellata nello stomaco. Perdi 10 HP.");
    }
}

