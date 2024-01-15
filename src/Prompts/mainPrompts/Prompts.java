package Prompts.mainPrompts;

import GamePlay.Loop.LoopGame;

public class Prompts {

    public static void promptsMenuAvvioGioco(){
        System.out.println("Ti trovi in: " /*+ personaggio.getPosizione*/);
        System.out.println();
        System.out.println("Scegliere l'opzione desiderata");
        System.out.println("1 - azioni in" /*+ personaggio.getPosizione*/);
        System.out.println("2 - menù movimento");
    }

    public static void promptsMenuMovimento(){
        System.out.println("Dove vuoi andare?");
        System.out.println();
        System.out.println("1 - Casa di riposo");
        System.out.println("2 - Poste");
        System.out.println("3 - Tabacchino");
        System.out.println("4 - Bar");
        System.out.println("5 - Punto SNAI");
        System.out.println("6 - Mercato");
        System.out.println("7 - Tribunaale");
        System.out.println("8 - Bar");
        System.out.println("9 - Prigione");
        System.out.println("0 - esci dal menù");
    }

    public static void promptsMenuAzioni(){
        //TODO
    }
}
