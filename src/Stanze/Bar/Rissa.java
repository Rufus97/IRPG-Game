package Stanze.Bar;

import Input.Casuale;
import Input.In;
import Main.GamePanel;

public class Rissa {

    public static void faiRissa(){

        int scelta;

        if(GamePanel.giocatore.getLivelloSballo() <= 0) {

            System.out.println("Sferri due colpi al barista e lo metti KO");
            System.out.println("LO HAI FATTO NERO! i clienti scappano dal bar... cosa vuoi fare?");
            GamePanel.giocatore.controlloSetSoddisfazione(6);
            System.out.println("Soddisfazione +" + 6 + "\n");
            GamePanel.giocatore.controlloSetKarma(-0.2);
            System.out.println("Karma +" + -0.2 + "\n");


            GamePanel.giocatore.mostraStatistiche();
            System.out.println("\n1. Ruba dalla cassa");
            System.out.println("0. Esci");

            scelta = In.inputInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1 -> rubaDallaCassa();
                case 0 -> System.out.println("Dove ca**o vai pezzo di me**a!");
                default -> System.err.println("Scelta errata! selezionare una delle opsioni del menù");
            }
        } else {
            System.out.println("Ce l'hai prese");
            GamePanel.giocatore.controlloSetHP(-10);
        }
    }

    public static void faiRissaConArma(){

        int scelta;

        if(GamePanel.giocatore.getLivelloSballo() <= 0){

            System.out.println("SEI TROPPO BRILLO PER CONTINUARE A BERE! Spacchi la bottiglia e minacci il barista...");
            System.out.println("Soddisfazione +" + 6 + "\n");
            GamePanel.giocatore.controlloSetSoddisfazione(6);
            System.out.println("Karma -" + 0.2 + "\n");

            GamePanel.giocatore.mostraStatistiche();
            System.out.println("\n1. Rapina tutte le persone predenti nel bar!");
            System.out.println("0. Ci ripensi... abbassi l'arma e scappi via");

            scelta = In.inputInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1 -> System.out.println("Ci stiamo lavorando...");//rapinaAlBar();
                case 0 -> System.out.println("Scappa che se te pijo t'ammazzo!");
                default -> System.err.println("Scelta errata! selezionare una delle opsioni del menù");
            }

        }else {
            System.out.println("Ce l'hai prese");
            GamePanel.giocatore.controlloSetHP(-10);
        }
    }

    public static void rubaDallaCassa(){
        double soldiValue;

        if(GamePanel.giocatore.getKarma() != -1){

            if(GamePanel.giocatore.getKarma() >= 0 && GamePanel.giocatore.getKarma() <= 1){
                GamePanel.giocatore.setSoldi(soldiValue = Casuale.numeroCasualeTraDouble(20.0,100.0));

            }else {GamePanel.giocatore.setSoldi(soldiValue = Casuale.numeroCasualeTraDouble(0.0,20.0));}
            System.out.println("Daje! oggi se magna!");
            System.out.println("Soldi +" + Math.round(soldiValue * 100.0) / 100.0 + "\n");

            GamePanel.giocatore.setLivelloSoddisfazione(0.06);
            System.out.println("Soddisfazione +" + 0.06);

        } else {System.out.println("Te dice male! Non c'è 'na lira in cassa");}

        GamePanel.giocatore.controlloSetKarma(0.06);
        System.out.println("karma -" + 0.06);


        double numberValue = GamePanel.giocatore.getKarma() * 100;
        int numeroCasuale = Casuale.numeroCasualeTra(1,20);

    }

    public static void rapinaAlBar(){
        //TODO
    }

}