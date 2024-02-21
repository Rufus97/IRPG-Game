package Main;
import Input.In;
import Stanze.Bar.Bar;
import Stanze.Tabacchino.Tabacchino;
import Stanze.Cantiere.Cantiere;

public class Menu {
    
    Tabacchino tabachino;
    public static void VaiA(){
        int scelta;

            do{
                System.out.println("Dove vuoi andare?");
                System.out.println("1. Tabacchino");
                System.out.println("2. Bar");
                System.out.println("3. Cantiere");
                System.out.println("0. Torna al menu precedente");

                scelta = In.inputInt();
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

                case 3:
                    Cantiere cantiere = new Cantiere("Scavi archeologici");
                    System.out.println("Cantiere");
                    cantiere.runCantiere();
                break;



        
                default:
                    System.out.println("Scelta errata");
                break;   
                }
                
            }while( scelta !=0 );
            
        }        
}


