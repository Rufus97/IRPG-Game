package Stanze.Parco;

import Input.In;
import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.Parco.CannaItems.Erba;
import Stanze.Tabacchino.itemsTabacchino.items.Cartine;
import Stanze.bar.items.oggetti.Fumo;

import java.util.Map;


public class InterazioneCanna {
    RandomDice rng = new RandomDice();

    public void rollaUnaCanna() {
        System.out.println("Hai scelto di rollare una canna.");
        boolean possiedeErba = false;
        boolean possiedeCartine = false;
        boolean possiedeFumo = false;
        ConsumableItems fumo = null;
        ConsumableItems erba = null;
        ConsumableItems cartine = null;

        for (ConsumableItems element : NewInventory.getInventory().getAllConsumables().values()){

            if (element instanceof Erba){
                erba = element;
                possiedeErba = true;
            }
            if(element instanceof Cartine){
                cartine = element;
                possiedeCartine = true;
            }
            if(element instanceof Fumo){
                fumo = element;
                possiedeFumo = true;
            }
        }


        if ((possiedeErba || possiedeFumo) && possiedeCartine) {

            GamePanel.giocatore.setLivelloSoddisfazione(0.1);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Soddisfazione: " + GamePanel.giocatore.getLivelloSoddisfazione());

            NewInventory.getInventory().consumeAnItem(erba);
            NewInventory.getInventory().consumeAnItem(cartine);

            // Evento randomico collegato al punteggio karma
            if (rng.getDado(1,10) >= 4) {
                Brumotti event = new Brumotti();
                event.attivaEventoBrumotti();
            }


        } else {
            if(!possiedeErba) {
                System.out.println("Non possiedi dell'erba per rollare una canna.");
            } else System.out.println("Non possiedi le cartine per ronnalare una canna.");
        }


    }
}
