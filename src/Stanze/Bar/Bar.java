package Stanze.Bar;

import Input.In;
import Main.GamePanel;

public class Bar {

    public void runBar(){
    
        int scelta;
       
        do {GamePanel.giocatore.mostraStatistiche();
        	System.out.println(" ");
        	System.out.println("Sei nel Bar, cosa vuoi fare?");
            System.out.println("1. Caffè 1 Euro");
            System.out.println("2. Campari/Gin 5 Euro");
            System.out.println("3. Rissa");
            System.out.println("0. Esci");

            scelta = In.inputInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1:
                    if(GamePanel.giocatore.controllaSoldi(-1D) == true) {
                        GamePanel.giocatore.controllaHP(2);
                        System.out.println("HP +" + 2 + "\n");
                    }
                    break;

                case 2:
                    if(GamePanel.giocatore.controllaSoldi(-6D) == true) {
                        GamePanel.giocatore.controllaHP(-6);
                        System.out.println("HP -" + 6);
                        GamePanel.giocatore.setLivelloSballo(0.1);
                        System.out.println("Sballo +" + 0.1 + "\n");

                    }
                    break;

                case 3:
                    Rissa.faiRissa();
                    break;

                case 0:
                    System.out.println("Bella zi");
                break;
            }

        } while (scelta!=0);
        
    }
    
}
