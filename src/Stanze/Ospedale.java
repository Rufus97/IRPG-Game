package Stanze;

import Input.Casuale;
import Main.GamePanel;

public class Ospedale {
    
    public static void HP0(){

        boolean seiSalvo = true;
        int ripristinoHP;
        int giorniVita;

        GamePanel.clearScreen();
        
        System.out.println("Sei messo male... i tuoi HP " + GamePanel.giocatore.getHP());
        System.out.println("Ti risvegli in ospedale... \nChiedi al dottore come stai...");

        if(seiSalvo == true){
            ripristinoHP = Casuale.numeroCasualeTra(10, 80);
            System.out.println("Dottore: Siamo riusciti a ricucirti... ti abbiamo ripristinato " + ripristinoHP + " HP");
            GamePanel.giocatore.setHP((GamePanel.giocatore.getHP()*-1) + ripristinoHP);                      
           
        }
        else{

            giorniVita = Casuale.numeroCasualeTra(1, 5);
            System.out.println("Dottore: Brutte notizie... \n ti rimangono " + giorniVita + " giorni di vita" );

        }
    }
}
