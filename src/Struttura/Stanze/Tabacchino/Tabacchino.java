package Struttura.Stanze.Tabacchino;

import Struttura.Input.In;
import GamePlay.EventiRandomici.Casuale;
import GamePlay.Menus.Menus;

import java.util.Arrays;


public class Tabacchino{

    DiecieLotto diecieLotto = new DiecieLotto();
    SetteMezzo setteMezzo = new SetteMezzo();
    int scelta;


    public void goToTabacchino(){

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Sei nel Tabacchino, Cosa vuoi fare? (1. Gioca a 10eLotto, 2.Gioca al 7 e Mezzo)");

        scelta = In.scanner.nextInt();
        switch (scelta) {
            case 1:
                diecieLotto.gioca10eLotto();
                break;

            case 2:
                setteMezzo.giocaSetteMezzo();
                break;
        }
    }
}
