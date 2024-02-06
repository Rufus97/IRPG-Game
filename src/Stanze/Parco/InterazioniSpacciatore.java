package Stanze;

import Player.Personaggio;

public class InterazioneSpacciatore {

    public static void approcciaLoSpacciatore(Personaggio personaggio) {
        System.out.println("Hai scelto di approcciare Aziz.");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Acquista erba");
        System.out.println("2. Lascia perdere");

        int sceltaAzione = In.inputInt();

        switch (sceltaAzione) {
            case 1:
                acquistaErba(personaggio);
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

        if (possiedeErba) {
            System.out.println("Hai già dell'erba nell'inventario.");
        } else {
            if (personaggio.getSoldi() >= prezzoErba) {
                personaggio.decrementaSoldi(prezzoErba);
                possiedeErba = true;
                System.out.println("Hai acquistato dell'erba da Aziz.");
            } else {
                System.out.println("Non hai abbastanza soldi per comprare l'erba.");
            }
        }
    }
}

