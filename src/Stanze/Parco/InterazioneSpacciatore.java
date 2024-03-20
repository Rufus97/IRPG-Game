package Stanze.Parco;

import Input.In;
import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.Oggetto;
import Stanze.Parco.CannaItems.Erba;


public class InterazioneSpacciatore {

    public static void approcciaLoSpacciatore() {
        System.out.println("Hai scelto di approcciare Aziz.");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Acquista erba");
        System.out.println("2. Lascia perdere");

        int sceltaAzione = In.inputInt();

        switch (sceltaAzione) {
            case 1:
                acquistaErba();
                GamePanel.giocatore.setLivelloSoddisfazione(-10);
                break;
            case 2:
                System.out.println("Hai deciso di lasciar perdere.");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
        }
    }

    private static void acquistaErba() {
        double prezzoErba = 12;

        if (GamePanel.giocatore.getSoldi() >= prezzoErba) {
           GamePanel.giocatore.controllaSoldi(prezzoErba); // Sottrai il prezzo dell'erba ai soldi del giocatore

            NewInventory.getInventory().addToBackpack(Erba.erbosa);
            System.out.println("Hai acquistato dell'erba da Aziz.");
            System.out.println("Soldi rimanenti: " + GamePanel.giocatore.getSoldi());
        } else {
            System.out.println("Non hai abbastanza soldi per comprare l'erba.");
        }
    }


}




