package Stanze.Mercato.Bancarella.SpecificBanc;


import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.ConsumableItems;
import Stanze.Mercato.Bancarella.BancItem;

public class Ortaggi extends BancItem implements ConsumableItems {


    public Ortaggi(String ortaggiName, double prezzoAlKg){
        super.setItemName(ortaggiName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("tra oltraggi e ortaggi");
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo al Kg: " + super.getPrezzoAlKg() +
                        " quantita: " + super.getQuantity() +
                        '}';
    }

    @Override
    public void consumeItem() {

    }

    @Override
    public void removeItem() {

    }
}
