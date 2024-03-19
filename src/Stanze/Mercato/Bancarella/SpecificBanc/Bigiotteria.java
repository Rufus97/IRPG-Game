package Stanze.Mercato.Bancarella.SpecificBanc;

import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.Bancarella.BancItem;

public class Bigiotteria extends BancItem implements EquippableItems {
    public Bigiotteria(String bigioName, double prezzo){
        super.setItemName(bigioName);
        super.setPrice(prezzo);
        super.setTypeOfBanc("cazzatine & collanine");
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo: " + super.getPrice() +
                        " quantita: " + super.getQuantity() +
                        '}';
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public void equipItem() {

    }
}
