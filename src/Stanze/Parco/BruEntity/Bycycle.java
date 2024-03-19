package Stanze.Parco.BruEntity;

import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Player.CharacterEquipment.InventoryNew.Inventory;

public class Bycycle implements EquippableItems {
    private String name = "bicicletta";
    private int dmg = 15;


    public Bycycle() {
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public void equipItem() {

    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void increaseQuantity() {

    }
}
