package Stanze.Cantiere;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;

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
                        commentaLavori();
                        break;

                        case 2: 
                        GamePanel.clearScreen();
                        entraNelCantiere();
                        
                        break;
                
                    default:
                        GamePanel.clearScreen();
                        System.out.println("Scelta errata");
                        break;

                }
        }while(scelta != 0 );
    }   

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

    public void entraNelCantiere(){

        int scelta;
        do{
            
            System.out.println("1. Ruba il trapano");         
            System.out.println("2. Ruba del rame");  

            System.out.println("0. Torna indietro");

            scelta = In.inputInt();
            
                switch (scelta) {
                    case 1:
                        GamePanel.clearScreen();
                        Oggetto trapano = new Oggetto("Trapano", 1);
                        GamePanel.inventario.aggiungiItem(trapano);
                        GamePanel.giocatore.setKarma(-0.05);
                        GamePanel.giocatore.MostraStatistiche();
                        break;

                        case 2:
                        GamePanel.clearScreen();
                        Oggetto rame = new Oggetto("Rame", 1);
                        GamePanel.inventario.aggiungiItem(rame);
                        GamePanel.giocatore.setKarma(-0.05);
                        GamePanel.giocatore.MostraStatistiche();
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
