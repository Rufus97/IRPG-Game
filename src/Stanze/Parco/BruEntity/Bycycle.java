package Stanze.Parco.BruEntity;

import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;

public class Bycycle implements EquippableItems {
    private String name = "bicicletta";
    private int dmg = 15;
    private EquipSlot slot = EquipSlot.WEAPON;


    public Bycycle() {
    }

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
    public void setArmor(int upgrade) {

    }

    @Override
    public String getName() {
        return name;
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
        return
                "name: '" + name + '\'' +
                ", dmg: " + dmg ;

    }
}
