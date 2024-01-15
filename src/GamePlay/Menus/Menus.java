package GamePlay.Menus;

import Prompts.mainPrompts.Prompts;
import Struttura.Input.In;
import Struttura.Stanze.*;

import java.util.Scanner;

public class Menus {

    public static void menuRunGame(){
        Prompts.promptsMenuAvvioGioco();

        int scelta = In.scanner.nextInt();
        boolean loopGioco = true;
        while (loopGioco) {

            switch (scelta) {
                case 1 -> menuAction();
                case 2 -> menuMovement();
                default -> System.err.println("Posizione non gestita.");
            }
        }
    }

    public static void menuMovement() {
        Prompts.promptsMenuMovimento();

        int scelta = In.scanner.nextInt();
        do {
            switch (scelta) {
                case 1 -> CasaDiRiposo.runCasaDiRiposo();
                case 2 -> Poste.runPoste();
                case 3 -> Tabacchino.runTabacchino();
                case 4 -> Bar.runBar();
                case 5 -> PuntoSNAI.runPuntoSNAI();
                case 6 -> Mercato.runMercato();
                case 7 -> Parco.runParco();
                case 8 -> Tribunale.runTribunale();
                case 9 -> Prigione.runPrigione();
                case 0 -> System.out.println("uscita in corso...");
                default -> System.err.println("input non valido");
            }
        }while (scelta != 0);
    }

    public static void menuAction() {
        Prompts.promptsMenuAzioni();

        //TODO
    }
}