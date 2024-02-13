package Stanze.Cantiere;

import Input.In;
import Main.GamePanel;

public class Commenti {
    
    public void commentaLavori(){
        int scelta;
        do{
            //menu solo per scavi??
            System.out.println("1. Sempre a rompe state");         
            System.out.println("2. A che ora staccate?");  
            System.out.println("3. Giovane cosi te fai male, non si usa cosi la pala"); 
            System.out.println("4. Tappate bene eh che l ultima volta uno con la moto è caduto");

            System.out.println("0. Torna indietro");

            scelta = In.inputInt();
            
                switch (scelta) {
                    case 1:
                
                        break;

                        case 2:
                        
                        break;

                        case 3:
                        
                        break;

                        case 4:
                        
                        break;
                        case 0:
                        GamePanel.clearScreen();
                        break;

                    default:
                        GamePanel.clearScreen();
                        System.out.println("Scelta errata");
                        break;
                }
        }while(scelta != 0 );
    }

}

