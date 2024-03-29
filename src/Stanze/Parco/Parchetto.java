package Stanze.Parco;

import Input.In;
import Main.GamePanel;
import Stanze.Stanza;

public class Parchetto implements Stanza {
    private InterazioneSpacciatore interazioneSpacciatore = new InterazioneSpacciatore();

    public void runStanza() {
        System.out.println("Benvenuto al parchetto di Tor bella Monaca");
        boolean continua = true;

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Approccia Aziz");
            System.out.println("2. Rolla una canna");
            System.out.println("3. Vai via dal parco");

            int sceltaAzione = In.inputInt();

            switch (sceltaAzione) {
                case 1:
                    interazioneSpacciatore.approcciaLoSpacciatore();
                    break;
                case 2:
                    InterazioneCanna canna = new InterazioneCanna();
                    canna.rollaUnaCanna();
                    break;
                case 3:
                    System.out.println("Hai scelto di uscire dal parco.");
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    @Override
    public String getNomeStanza() {
        return "Parco";
    }

    public void vieneArrestato() {
        GamePanel.giocatore.setHP(GamePanel.giocatore.getHP() - 10);
        GamePanel.giocatore.setLivelloSoddisfazione(GamePanel.giocatore.getLivelloSoddisfazione() -15);
        System.out.println("Sei stato arrestato! Hai perso punti HP, soddisfazione e i tuoi oggetti sono stati confiscati.");
    }

    private void interazioneCanna() {
        // Implementazione interazione con il rollare una canna
    }
}


