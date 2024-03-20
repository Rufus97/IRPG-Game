package Stanze.Mercato.Bancarella.SpecificBanc;

import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.Bancarella.BancItem;

public class Bigiotteria extends BancItem implements EquippableItems {

    private EquipSlot slot;
    public Bigiotteria(String bigioName, double prezzo, EquipSlot slot){
        super.setItemName(bigioName);
        super.setPrice(prezzo);
        super.setTypeOfBanc("cazzatine & collanine");
        this.slot = slot;
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
    public String getItemName() {
        return super.getItemName();
    }

    @Override
    public void equipItem() {
        if (!this.slot.isEquipped()){
            this.slot.setEquipped(true);
            this.slot.setEquippedItem(this);
        } else {
            System.out.println("replacing previous item");
            this.slot.setEquippedItem(this);
        }
    }

    @Override
    public int getDanni() {
        return 0;
    }

    @Override
    public void setArmor(int upgrade) {

    }
}
