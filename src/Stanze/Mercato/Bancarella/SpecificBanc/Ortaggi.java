package Stanze.Mercato.Bancarella.SpecificBanc;


import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Stanze.Mercato.Bancarella.BancItem;

public class Ortaggi extends BancItem implements ConsumableItems {

    public int restoreValue;
    public Ortaggi(String ortaggiName, double prezzoAlKg, int restoreValue){
        super.setItemName(ortaggiName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("tra oltraggi e ortaggi");
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
    public String getName() {
        return super.getItemName();
    }
    @Override
    public void consumeItem() {
        super.consumeQuantity();
        GamePanel.giocatore.controlloSetHP(this.restoreValue);
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
