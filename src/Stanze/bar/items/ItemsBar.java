package Stanze.bar.items;

import Player.CharacterEquipment.EquipSlot;

public class ItemsBar {

    private String name;
    private int armorOrDmg;
    private EquipSlot slot;

    public ItemsBar(String name, int armorOrDmg, EquipSlot slot) {
        this.name = name;
        this.armorOrDmg = armorOrDmg;
        this.slot = slot;
    }



    public String getName() {
        return name;
    }

    public int getArmorOrDmg() {
        return armorOrDmg;
    }

    public EquipSlot getSlot() {
        return slot;
    }

    public void setArmorOrDmg(int armorOrDmg) {
        this.armorOrDmg = armorOrDmg;
    }
}
