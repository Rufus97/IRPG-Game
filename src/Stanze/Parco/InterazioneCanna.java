package Stanze.Parco;

import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.Oggetto;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.Parco.CannaItems.Erba;

import java.util.Map;


public class InterazioneCanna {
    RandomDice rng = new RandomDice();

    public void rollaUnaCanna() {
        System.out.println("Hai scelto di rollare una canna.");
        boolean possiedeErba = false;
        ConsumableItems erba = null;

        for (ConsumableItems element : NewInventory.getInventory().getAllConsumables().values()){

            if (element instanceof Erba){
                erba = element;
                possiedeErba = true;
            }
        }
        if (possiedeErba) {
            GamePanel.giocatore.setLivelloSoddisfazione(10);
            GamePanel.giocatore.setHP(-5);

            System.out.println("Rolli un cannone e la accendi!");
            System.out.println("Punti Soddisfazione: " + GamePanel.giocatore.getLivelloSoddisfazione());
            System.out.println("HP attuali: " + GamePanel.giocatore.getHP());

            NewInventory.getInventory().consumeAnItem(erba);

            // Evento randomico collegato al punteggio karma
            if (rng.getDado(1,10) >= 4) {
                Brumotti event = new Brumotti();
                event.attivaEventoBrumotti();
            }


        } else {
            System.out.println("Non possiedi dell'erba per rollare una canna.");
        }
    }
}
