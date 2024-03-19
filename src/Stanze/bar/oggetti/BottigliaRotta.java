package Stanze.bar.oggetti;

import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;

public class BottigliaRotta implements EquippableItems {
    private String name = "bottiglia";
    private int dmg = 7;
    private EquipSlot slot = EquipSlot.WEAPON;


    @Override
    public int getArmor() {
        return 0;
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
        return this.dmg;
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
                "name='" + name + '\'' +
                ", dmg=" + dmg +
                ", slot=" + slot +
                '}';
    }
}
