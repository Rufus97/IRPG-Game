package Stanze.Bar;

import Input.Casuale;
import Input.In;
import Main.GamePanel;

public class Rissa {

    public static void esitoRissa(){

        GamePanel.giocatore.mostraStatistiche();
        int scelta;

        if(GamePanel.giocatore.getLivelloSballo() <= 0){

            System.out.println("Sei il Re del bar!");
            GamePanel.giocatore.setLivelloSoddisfazione(6);

            do{
                System.out.println("1. Ruba dalla cassa");
                System.out.println("0. Esci");

                scelta = In.scanner.nextInt();
                GamePanel.clearScreen();

                switch (scelta) {
                    case 1 -> rubaDallaCassa();
                    case 0 -> System.out.println("Fai bene a scappare!");
                }
            }while (scelta != 0);


        }else {
            System.out.println("Ce le hai prese");
            GamePanel.giocatore.controllaHP(-10);
        }
    }

    public static void rubaDallaCassa(){

        GamePanel.giocatore.mostraStatistiche();

        GamePanel.giocatore.controllaKarma(0.07);
        if(GamePanel.giocatore.getKarma() >= 0){

            if(GamePanel.giocatore.getKarma() >= 0 && GamePanel.giocatore.getKarma() <= 0.50){
                GamePanel.giocatore.setSoldi(Casuale.numeroCasualeTraDouble(0.99,50.0));
            }else {GamePanel.giocatore.setSoldi(Casuale.numeroCasualeTraDouble(50.01,100.0));}

        } else {System.out.println("Ti dice male! Non c'è una lira in cassa");}
    }

}