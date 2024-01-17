package Main;
import Input.In;
import Stanze.Bar.Bar;
import Stanze.Tabacchino.Tabacchino;

public class Menu {
    
    Tabacchino tabachino;
    public static void VaiA(){
        int scelta;

            do{
                System.out.println("Dove voi andare?");
                System.out.println("1. Tabacchino");
                System.out.println("2. Bar");
                System.out.println("0. Torna al menu precedente");

                scelta = In.scanner.nextInt();
                GamePanel.clearScreen();

                switch (scelta) {
                case 1:
                    Tabacchino tabacchino = new Tabacchino();
                    System.out.println("Tabacchno");
                    tabacchino.runTabacchino();
                break;

                case 2:
                    Bar bar = new Bar();
                    System.out.println("Bar");
                    bar.runBar();
                break;
        
                default:
                    System.out.println("Scelta errata");
                break;   
                }
                
            }while( scelta !=0 );
            
        }        
}



