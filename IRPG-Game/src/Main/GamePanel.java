package Main;

import Input.In;
import Player.Personaggio;


public class GamePanel {

    public static final Personaggio giocatore = new Personaggio();

    //costruttore
    public GamePanel(){
    }

        public void startGame(){
        
            int scelta;

            //Loop menu
            do{
                System.out.println("Cosa vuoi fare?");
                System.out.println("1. Vai a...");
                System.out.println("2. Apri Inventario...");
                System.out.println("0. Esci dal gioco");
                scelta = In.scanner.nextInt();
                GamePanel.clearScreen();
                    switch (scelta) {
                        case 1: 
                        Menu.VaiA();
                        break;

                        case 2:
                        //apri metodo inventario
                        break;

                        case 3:
                        System.out.println("Exit Game");
                        break;
        
                    default:
                        System.out.println("Scelta errata");
                        break;   
                    }
                    
        }while( scelta !=0 );
    }

    //METODO CANCELLA SCHERMO
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
