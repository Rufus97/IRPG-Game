package Stanze.Cantiere;

import Input.In;
import Main.GamePanel;

public class Cantiere {

  
//costruttore
   public Cantiere(String nome){
    
   }

    public void runCantiere(){
        
        int scelta;

        do{
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Commenta i lavori");         //correggi l operaio
            System.out.println("2. Entra nel cantiere");  //ruba qualcosa rame ferro attrezzi
           // System.out.println("3. Taglia per il cantiere"); //tempo --
            System.out.println("0. Torna indietro e prosegui per la destinazione"); //tempo ++

            scelta = In.inputInt();

            
                switch (scelta) {
                    case 1:
                        GamePanel.clearScreen();
                        Action action = new Action();
                        GamePanel.giocatore.mostraStatistiche();
                        action.commentaLavori();
                        break;

                        case 2: 
                        GamePanel.clearScreen();
                        EntraNelCantiere inCantiere = new EntraNelCantiere();
                        GamePanel.giocatore.mostraStatistiche();
                        inCantiere.entraNelCantiere();
                        
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
