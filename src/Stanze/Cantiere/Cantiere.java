package Stanze.Cantiere;

import Input.In;
import Main.GamePanel;

public class Cantiere {
    
    String nome;
    Boolean giaStato = false;
    
    //costruttore
   public Cantiere(String nome){
    this.nome = nome;
   }

    public void runCantiere(){
        
        int scelta;

        do{
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Commenta i lavori");         //correggi l operaio
            System.out.println("2. Entra nel cantiere");  //ruba qualcosa rame ferro attrezzi
            System.out.println("3. Taglia per il cantiere"); //tempo --
            System.out.println("0. Torna indietro e prosegui per la destinazione"); //tempo ++

            scelta = In.inputInt();

            
                switch (scelta) {
                    case 1:
                        GamePanel.clearScreen();
                        Commenti commenti = new Commenti();
                        commenti.commentaLavori();
                        break;

                        case 2: 
                        GamePanel.clearScreen();
                        EntraNelCantiere inCantiere = new EntraNelCantiere();
                        inCantiere.entraNelCantiere();
                        break;

                        case 3: 
                        //nulla da fare per il momento
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
