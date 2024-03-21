package Stanze;

import Input.In;
import Main.GamePanel;
import Main.Menu;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.bar.items.oggetti.Bottiglia;


public class Questura implements Stanza {

    RandomDice dado = new RandomDice();



    public void runStanza() {
        System.out.println("Sei finito dentro!");
        GamePanel.giocatore.mostraStatistiche();
        boolean continua = true;

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Parla con il maresciallo");
            System.out.println("2. Chiama l'avvocato");
            System.out.println("3. Tenta la fuga");

            int sceltaAzione = In.inputInt();
            Questura questura = new Questura();

            switch (sceltaAzione) {
                case 1:
                    continua = questura.parlaConMaresciallo();
                    break;
                case 2:
                    continua = questura.chiamaAvvocato();
                    break;
                case 3:
                    continua = questura.tentaLaFuga();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    private boolean parlaConMaresciallo() {

        System.out.println("Cerci di persuadere il maresciallo inventando una storia incredibile e commuovente...");



        if(dado.getDado(1,20) < 7){
            System.out.println("NON INCANTI NESSUNO!");
            System.out.println("il maresciallo ti tira una manganellata sui denti!");
            GamePanel.giocatore.controlloSetHP(-10);
            return true;
        }

        System.out.println("Il maresciallo rimane molto colpito dalle tue parole e decide di farti uscire");
        return false;
    }

    private boolean chiamaAvvocato() {
        System.out.println("Chiedi alla guardia di poter fare una telefonata. Decidi di chiamare l'avvocato.");
        System.out.println("Il telefono squilla e senti la voce dell'avvocato Diprè che ti dice di stare tranquillo e che pagherà la cauzione.");
        if(GamePanel.giocatore.controllaSoldi(-70D)){
            System.out.println("Ti vengono scalati 100 euro, ma almeno torni a piede libero.");
            return false;
        }
        return true;
    }

    private boolean tentaLaFuga() {

        if(dado.getDado(1,20) < 17){
            System.out.println("Una guardia ti colpisce con un manganellata nello stomaco. Perdi 5 HP.");
            GamePanel.giocatore.controlloSetHP(-5);
            return true;
        }

        System.out.println("Corri cazzo! che non ti vede nessuno");
        return false;
    }

    @Override
    public String getNomeStanza() {
        return "Questura";
    }
}

