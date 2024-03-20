package Stanze.Cantiere;

import Input.In;
import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.Oggetto;
import Stanze.Cantiere.Materials.Rame;

public class EntraNelCantiere {
    
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
                        GamePanel.giocatore.mostraStatistiche();
                        break;

                        case 2:
                        GamePanel.clearScreen();

                        NewInventory.getInventory().addToBackpack(new Rame());
                        GamePanel.giocatore.setKarma(-0.05);
                        GamePanel.giocatore.mostraStatistiche();
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
