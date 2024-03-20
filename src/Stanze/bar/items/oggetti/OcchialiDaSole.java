package Stanze.bar.items.oggetti;

import Main.GamePanel;
import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.bar.items.ItemsBar;

public class OcchialiDaSole extends ItemsBar implements EquippableItems {


    public OcchialiDaSole(String name, int armorOrDmg, EquipSlot slot) {
        super("occhiali da sole", 1, EquipSlot.HEAD);
    }


    @Override
    public int getArmor() {
        return super.getArmorOrDmg();
    }

    @Override
    public void equipItem() {
        if (!super.getSlot().isEquipped()){
            super.getSlot().setEquipped(true);
            super.getSlot().setEquippedItem(this);
            GamePanel.giocatore.setLivelloSballo(-0.3);

        } else {
            System.out.println("replacing previous item");
            super.getSlot().setEquippedItem(this);

        }

    }

    @Override
    public int getDanni() {
        return 0;
    }

    @Override
    public void setArmor(int upgrade) {
        int setArmor = super.getArmorOrDmg();
        super.setArmorOrDmg( setArmor += upgrade);
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void increaseQuantity() {

    }
}
