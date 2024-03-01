package Stanze.Tabacchino;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;

public class Sigarette implements Itabacchino{

    public void run(){
        System.out.println( "I tuoi Soldi " +GamePanel.giocatore.getSoldi()  + "\n");
        System.out.println("che voi zi?");
        int scelta;
        do {
        
        System.out.println("1. Malrboro 6 Euro");
        System.out.println("2. Tabacco LUCKY STRIKE ORIGINAL RED 30 grammi 6.80 Euro");
        System.out.println("3. FILTRI RIZLA SLIM 6mm - SCATOLA SINGOLA DA 150 FILTRI 0.80 Euro");
        System.out.println("4. Cartine CARTINE CORTE SMOKING REGULAR ORGANIC 100% CANAPA BIO 60 cartine 0.40 Euro");
        System.out.println("0. Esci");

        scelta = In.scanner.nextInt();

        switch (scelta) {
            case 1:

                if (GamePanel.giocatore.controllaSoldi(-6d) == true){
                
                System.out.println( GamePanel.giocatore.getSoldi());
                System.out.println( "Hai comprato un pacco di sigarette");
                Oggetto malboro = new Oggetto("marlboro", 20);
                GamePanel.inventario.aggiungiItem(malboro); 
                }else{
                    System.out.println("Problemi di soldi?");
                    System.out.println("NON HAI COMPRATO NIENTE");
                }
            break;

            case 2:
                if (GamePanel.giocatore.controllaSoldi( -6.8) == true){
                    
                    System.out.println( GamePanel.giocatore.getSoldi());
                    System.out.println( "Hai comprato un pacco di tabacco");
                    Oggetto tabacco = new Oggetto("tabacco", 30);
                    GamePanel.inventario.aggiungiItem(tabacco);
                    }else{
                        System.out.println("Problemi di soldi?");
                        System.out.println("NON HAI COMPRATO NIENTE");
                    }
            break;
            
            case 3:
                if (GamePanel.giocatore.controllaSoldi( -0.8) == true){
                   
                    System.out.println( GamePanel.giocatore.getSoldi());
                    System.out.println( "Hai comprato un pacco di filtri");
                    Oggetto filtri = new Oggetto("filtri", 150);
                    GamePanel.inventario.aggiungiItem(filtri);
                    
                }else{
                    System.out.println("Problemi di soldi?");
                    System.out.println("NON HAI COMPRATO NIENTE");
                }
            break;
            
            case 4:
                if (GamePanel.giocatore.controllaSoldi( -0.4) == true){
                    
                    System.out.println( GamePanel.giocatore.getSoldi());
                    System.out.println( "Hai comprato un pacco di cartine");
                    Oggetto cartine = new Oggetto("cartine", 60);
                    GamePanel.inventario.aggiungiItem(cartine);
                }else{
                    System.out.println("Problemi di soldi?");
                    System.err.println("NON HAI COMPRATO NIENTE");
                }
            break;


            default:
                System.out.println("Eh? nnoccapito");
            break;
        }
        System.out.println( "I tuoi Soldi " + GamePanel.giocatore.getSoldi()  + "\n");
        System.out.println("Apposto capo?");
            
        } while (scelta != 0);
       
    }

}
