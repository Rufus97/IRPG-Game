package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.ConsumableItems;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.BancItem;

public class Pesce extends BancItem implements ConsumableItems {

    public Pesce(String fishName, double prezzoAlKg){
        super.setItemName(fishName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("pescheria");
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
