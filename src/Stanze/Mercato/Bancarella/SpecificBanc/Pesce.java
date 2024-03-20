package Stanze.Mercato.Bancarella.SpecificBanc;

import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.Bancarella.BancItem;

public class Pesce extends BancItem implements ConsumableItems {
    public int restoreValue;
    public Pesce(String fishName, double prezzoAlKg, int restoreValue){
        super.setItemName(fishName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("pescheria");
        this.restoreValue = restoreValue;
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo al Kg: " + super.getPrezzoAlKg() +
                " quantita: " + super.getQuantity() +
                '}';
    }

    public int getRestoreValue() {
        return restoreValue;
    }

    @Override
    public void consumeItem() {
     super.consumeQuantity();
        GamePanel.giocatore.controlloSetHP(this.restoreValue);
        System.out.println("you consumed " + this + " for: " + restoreValue);
    }
    @Override
    public String getName() {
        return super.getItemName();
    }
    @Override
    public int healAmount() {
        return this.restoreValue;
    }
    @Override
    public String getItemName() {
        return super.getItemName();
    }

}
