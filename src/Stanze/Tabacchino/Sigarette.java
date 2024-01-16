package Stanze.Tabacchino;

import Input.In;
import Main.GamePanel;

public class Sigarette {

    public static void compraSigarette(){
        System.out.println( "I tuoi Soldi " +GamePanel.giocatore.getSoldi()  + "\n");
        System.out.println("A ste eta zi? che vuoi?");
        int scelta;
        do {
        
        System.out.println("1. Malrboro");
        System.out.println("2. Tabacco");
        System.out.println("3. Filtrini");
        System.out.println("4. Cartine");
        System.out.println("0. Esci");

        scelta = In.scanner.nextInt();

        switch (scelta) {
            case 1: 

                if (Sigarette.controllaSoldi(GamePanel.giocatore.getSoldi(), 6) == true){
                GamePanel.giocatore.setSoldi(-6);
                System.out.println( GamePanel.giocatore.getSoldi());
                }
                
                break;

            case 2:
                
                break;
            
            case 3:
                
                break;
            
            case 4:
                
                break;


            default:
            System.out.println("Eh? nnoccapito");
                break;
        }
        System.out.println( "I tuoi Soldi " +GamePanel.giocatore.getSoldi()  + "\n");
        System.out.println("Apposto capo?");
            
        } while (scelta != 0);

    }

    public static boolean controllaSoldi(double soldiGiocatore ,double Prezzo){
        boolean danaro = false;

        if(soldiGiocatore >= Prezzo){danaro = true;}

        return danaro;
    }

}
