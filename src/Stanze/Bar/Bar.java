package Stanze.Bar;

import Input.In;
import Main.GamePanel;

public class Bar {

    public void runBar(){
    
        int scelta;
       
        do {GamePanel.giocatore.mostraStatistiche();
        	System.out.println(" ");
        	System.out.println("Sei nel Bar, cosa vuoi fare?");
            System.out.println("1. Fai colazione");
            System.out.println("2. Compra da magna");
            //System.out.println("3. Bevite 'na cosa");
            //System.out.println("4. Sbrocca e inizia 'na rissa cor barista");
            System.out.println("0. Esci");

            scelta = In.inputInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1:
                    Colazione.faiColazione();
                    break;

                case 2:
                    Alcolici.beviteNaCosa();
                    break;

                case 3:
                    System.out.println("ci stiamo lavorando");
                    break;

                case 4:
                    Rissa.faiRissa();
                    break;

                case 0:
                    System.out.println("Bella zi");
                break;
            }

        } while (scelta!=0);
        
    }
    
}
