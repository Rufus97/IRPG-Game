package Stanze.Parco;

import Input.In;
import Main.GamePanel;
import Player.Inventario;
import Player.Oggetto;
import Player.Personaggio;

public class InterazioneSpacciatore {

    private static Personaggio personaggio;

    public static void approcciaLoSpacciatore() {
        System.out.println("Hai scelto di approcciare Aziz. Lo saluti e ti siedi sulla panchina a fianco a lui");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Acquista erba");
        System.out.println("2. Lascia perdere");

        int sceltaAzione = In.inputInt();

        switch (sceltaAzione) {
            case 1:
                acquistaErba();
                break;
            case 2:
                System.out.println("Hai deciso di lasciar perdere. Saluti Aziz");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
        }
    }

    private static void acquistaErba() {
        System.out.println("Soldi: " + GamePanel.giocatore.getSoldi());
        double prezzoErba = 12;
        boolean possiedeErba = false;
        Oggetto erba = new Oggetto("Erba", 1);

        if (possiedeErba) {
            System.out.println("Hai già dell'erba nell'inventario.");
        } else {
            if (GamePanel.giocatore.getSoldi() >= prezzoErba) {
                GamePanel.giocatore.setSoldi(- prezzoErba); // Sottrai il prezzo dell'erba ai soldi del giocatore
                possiedeErba = true;
                GamePanel.inventario.aggiungiItem(erba);

                System.out.println("Hai acquistato dell'erba da Aziz.");
            } else {
                System.out.println("Non hai abbastanza soldi per comprare l'erba.");
            }
        }
    }
}


