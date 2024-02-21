package Stanze.Bar;

import Input.Casuale;
import Input.In;
import Main.GamePanel;

public class Rissa {

    public static void faiRissa(){

        int scelta;

        if(GamePanel.giocatore.getLivelloSballo() <= 0){

            System.out.println("LI HAI FATTI NERI!");
            GamePanel.giocatore.setLivelloSoddisfazione(6);
            System.out.println("Soddisfazione +" + 6 + "\n");

            do{
                GamePanel.giocatore.mostraStatistiche();
                System.out.println("\n1. Ruba dalla cassa");
                System.out.println("0. Esci");

                scelta = In.inputInt();
                GamePanel.clearScreen();

                switch (scelta) {
                    case 1 -> rubaDallaCassa();
                    case 0 -> System.out.println("Fai bene a scappare!");
                    default -> System.err.println("Scelta errata! selezionare una delle opsioni del menù");
                }
            }while (scelta != 0);


        }else {
            System.out.println("Ce l'hai prese");
            GamePanel.giocatore.controllaHP(-10);
        }
    }

    public static void rubaDallaCassa(){
        double soldiValue;

        GamePanel.giocatore.controllaKarma(0.07);
        if(GamePanel.giocatore.getKarma() >= 0){

            if(GamePanel.giocatore.getKarma() >= 0 && GamePanel.giocatore.getKarma() <= 0.49){
                GamePanel.giocatore.setSoldi(soldiValue = Casuale.numeroCasualeTraDouble(0.50,50.0));
            }else {GamePanel.giocatore.setSoldi(soldiValue = Casuale.numeroCasualeTraDouble(50.01,100.0));}
            System.out.println("Daje! oggi se magna!");
            System.out.println("Soldi +" + Math.round(soldiValue * 100.0) / 100.0 + "\n");
        } else {System.out.println("Te dice male! Non c'è 'na lira in cassa");}


    }

}