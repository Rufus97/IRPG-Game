package Stanze.Tabacchino;

import Input.In;
import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.Inventory;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Tabacchino.itemsTabacchino.items.Cartine;
import Stanze.Tabacchino.itemsTabacchino.items.FiltriRizla;
import Stanze.Tabacchino.itemsTabacchino.items.Marlboro;
import Stanze.Tabacchino.itemsTabacchino.items.TabaccoLS;

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

                if (GamePanel.giocatore.controllaSoldi(-6d)){
                
                System.out.println(GamePanel.giocatore.getSoldi());
                System.out.println("Hai comprato un pacco di Marlboro");
                NewInventory.getInventory().addToBackpack(Marlboro.marlboro);

                }
            break;

            case 2:
                if (GamePanel.giocatore.controllaSoldi( -6.8)) {

                    System.out.println(GamePanel.giocatore.getSoldi());
                    System.out.println("Hai comprato un pacco di tabacco");
                    NewInventory.getInventory().addToBackpack(TabaccoLS.tabaccoLS);
                }

            break;
            
            case 3:
                if (GamePanel.giocatore.controllaSoldi( -0.8)){
                   
                    System.out.println( GamePanel.giocatore.getSoldi());
                    System.out.println( "Hai comprato un pacco di filtri");
                    NewInventory.getInventory().addToBackpack(FiltriRizla.filtriRizla);
                    
                }
            break;
            
            case 4:
                if (GamePanel.giocatore.controllaSoldi( -0.4)){
                    
                    System.out.println( GamePanel.giocatore.getSoldi());
                    System.out.println( "Hai comprato un pacco di cartine");
                    NewInventory.getInventory().addToBackpack(Cartine.cartine);
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
