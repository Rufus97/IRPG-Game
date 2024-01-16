package Stanze.Bar;

import Input.In;
import Main.GamePanel;


public class Bar {


        public void runBar(){
    
        int scelta;
       
        do {System.out.println("Sei nel Bar, Cosa vuoi fare?");
            System.out.println("1. Prendi Caffè");
            System.out.println("2. Prendi un Campari/Gin");
            System.out.println("3. Esci");


            scelta = In.scanner.nextInt();
            GamePanel.clearScreen();

            switch (scelta) {
                case 1:
                System.out.println("Prendi Caffè Nulla da fare qui \n");
                break;

                case 2:
                System.out.println("Prendi Un CampariGin Nulla da fare qui \n");
                break;
                case 3:
                System.out.println("Bella zi");
                break;
        
            }
            
        } while (scelta!=3);
        
    }
    
}
