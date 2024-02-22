package Stanze.Bar;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;

public class Alcolici {
    public static void beviteNaCosa() {

        int scelta;

        do {
            GamePanel.giocatore.mostraStatistiche();
            System.out.println(" ");
            System.out.println("CHE TE BEVI?");
            System.out.println("1. Birra in bottiglia - 3€");
            //System.out.println("2. Fatti qualcosa di forte - 10€");
            System.out.println("0. Esci");

            scelta = In.inputInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1:
                    if(GamePanel.giocatore.controllaSoldi(-3D)) {
                        GamePanel.giocatore.controlloSetHP(-2);
                        System.out.println("HP -" + 3);
                        GamePanel.giocatore.controlloSetSballo(0.1);
                        System.out.println("Sballo +" + 0.1 + "\n");

                        if(GamePanel.giocatore.getLivelloSballo() >= 0.5){
                            Rissa.faiRissaConArma();
                        }else{
                            Oggetto bottiglia = new Oggetto("bottiglia", 1);
                            GamePanel.inventario.aggiungiItem(bottiglia);
                            System.out.println("hai ottenuto un'arma di tipo Bottiglia!");
                            System.out.println("Bottiglia +1");
                        }
                    }
                    break;
                case 2:

                    break;

                case 0:
                    System.out.println("C'ho ripensato...");
                    break;
            }

        } while (scelta != 0);
    }
}