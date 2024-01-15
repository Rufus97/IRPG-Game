package GamePlay.Loop;
import GamePlay.Menus.Menus;
import Struttura.Personaggio.Personaggio;

public class LoopGame {

    public static void runGame() {

        Personaggio personaggio = new Personaggio();
        Menus.menuRunGame();
        System.out.println("Grazie per aver giocato!");
    }

}
