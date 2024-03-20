package Stanze.bar.items.oggetti;

import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.bar.items.ItemsBar;

public class BottigliaRotta extends ItemsBar implements EquippableItems  {

    public BottigliaRotta() {
        super("bottiglia", 7, EquipSlot.WEAPON);

    }


    @Override
    public int getArmor() {
        return 0;
    }
    @Override
    public void equipItem() {
        if (!super.getSlot().isEquipped()){
            super.getSlot().setEquipped(true);
            super.getSlot().setEquippedItem(this);
        } else {
            System.out.println("replacing previous item");
            super.getSlot().setEquippedItem(this);
        }
    }

    @Override
    public int getDanni() {
        return super.getArmorOrDmg();
    }

    @Override
    public void setArmor(int upgrade) {
        int getArmor = super.getArmorOrDmg();
        getArmor += upgrade;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void increaseQuantity() {

    }

    @Override
    public String toString() {
        return "BottigliaRotta{" +
                "name='" + super.getName() + '\'' +
                ", dmg=" + super.getArmorOrDmg() +
                ", slot=" + super.getSlot() +
                '}';
    }
}
