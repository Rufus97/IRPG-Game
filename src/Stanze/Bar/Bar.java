package Stanze.Bar;

import Input.In;
import Main.GamePanel;

public class Bar {

    public void runBar(){
    
        int scelta;
       
        do {System.out.println("Soldi: " + GamePanel.giocatore.getSoldi() +" HP: "+ GamePanel.giocatore.getHP());
        	System.out.println(" ");
        	System.out.println("Sei nel Bar, Cosa vuoi fare?");
            System.out.println("1. Caffè 1 Euro");
            System.out.println("2. Campari/Gin 5 Euro");
            System.out.println("3. Esci");

            scelta = In.scanner.nextInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1:
                    if(GamePanel.giocatore.controllaSoldi(-1D) == true) {
                    GamePanel.giocatore.controllaHP(2);
                    }
                    break;

                case 2:
                    if(GamePanel.giocatore.controllaSoldi(-6D) == true) {
                    GamePanel.giocatore.controllaHP(-6); 
                    }
                    break;

                case 3:
                    System.out.println("Bella zi");
                break;
            }

        } while (scelta!=3);
        
    }
    
}
