package Stanze.Parco;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;
import Player.Personaggio;

public class InterazioneSpacciatore {

    public static void approcciaLoSpacciatore() {
        System.out.println("Hai scelto di approcciare Aziz.");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Acquista erba");
        System.out.println("2. Lascia perdere");

        int sceltaAzione = In.inputInt();

        switch (sceltaAzione) {
            case 1:
                acquistaErba(GamePanel.giocatore);
                GamePanel.giocatore.setLivelloSoddisfazione(-10););
                break;
            case 2:
                System.out.println("Hai deciso di lasciar perdere.");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
        }
    }

    private static void acquistaErba(Personaggio personaggio) {
        int prezzoErba = 12;
        boolean possiedeErba = false;

        if (possiedeErba) {
            System.out.println("Hai già dell'erba nell'inventario.");
        } else {
            if (personaggio.getSoldi() >= prezzoErba) {
                GamePanel.giocatore.setSoldi(-20.0); // Sottrai il prezzo dell'erba ai soldi del giocatore
                possiedeErba = true;
                Oggetto erba = new Oggetto("Erba", 1);
                GamePanel.inventario.aggiungiItem(erba);
                System.out.println("Hai acquistato dell'erba da Aziz.");
            } else {
                System.out.println("Non hai abbastanza soldi per comprare l'erba.");
            }
        }
    }
}


