package Stanze.Bar;

import Input.Casuale;
import Input.In;
import Main.GamePanel;
import Player.Oggetto;
import Stanze.Questura;
import Stanze.Questura;

public class Colazione {

    public static void faiColazione(){

        int scelta;

        do {GamePanel.giocatore.mostraStatistiche();
            System.out.println(" ");
            System.out.println("CHE TE PREPARO?");
            System.out.println("1. Caffe - 1€");
            System.out.println("2. Cappuccino e cornetto - 3€");
            System.out.println("3. Er fumo bono der barista - 12€");
            System.out.println("0. Esci");

            scelta = In.inputInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1:
                    if(GamePanel.giocatore.controllaSoldi(-1D)) {
                        GamePanel.giocatore.controlloSetHP(2);
                        System.out.println("Soldi -" + 1);
                        System.out.println("HP +" + 2 + "\n");
                    }
                    break;

                case 2:
                    if(GamePanel.giocatore.controllaSoldi(-3D)) {
                        GamePanel.giocatore.controlloSetHP(5);
                        System.out.println("Soldi -" + 3);
                        System.out.println("HP +" + 5 + "\n");
                    }
                    break;

                case 3:
                    Oggetto fumo = new Oggetto("fumo",1);
                    if(GamePanel.giocatore.getKarma() >= 0){

                        if (GamePanel.giocatore.controllaSoldi(-12D)) {
                            GamePanel.giocatore.setSoldi(-12.0);
                            GamePanel.inventario.aggiungiItem(fumo);
                            System.out.println("SENTI CHE SMELLA STO FUMO!");
                        } else {
                            System.out.println("LA ROBA BONA SE PAGA!");
                        }
                        break;

                    }else{
                        if (GamePanel.giocatore.controllaSoldi(-12D)) {
                            GamePanel.giocatore.setSoldi(-12.0);
                            GamePanel.inventario.aggiungiItem(fumo);
                            System.out.println("SENTI CHE SMELLA STO FUMO!");
                        } else {
                            System.out.println("LA ROBA BONA SE PAGA!");
                        }
                        System.out.println("Entrano i CARRAMBA! Cerchi di nascondere il pacchetto nei pantaloni, ma non fai in tempo. La guardia ti afferra il braccio e ti carica in macchina");
                        Questura.runQuestura();
                        break;
                    }

                case 0:
                    System.out.println("C'ho ripensato...");
                    break;
            }

        } while (scelta!=0);



    }


}
