package Stanze.Mercato.AzioniMercato.CharacterEquipment;

import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;

public enum EquipSlot {
    HEAD(false, null, "Testa"),
    TORSO(false, null, "Torso"),
    LEGS(false, null, "Gambe"),
    FEET(false, null, "Piedi"),
    HANDS(false, null, "Mani");

    private boolean isEquipped;

    private BancItem equippedItem;

    private String slotName;



    private EquipSlot(boolean isEquipped, BancItem equippedItem, String name){

        this.isEquipped = isEquipped;
        this.equippedItem = equippedItem;
        this.slotName = name;
    }
    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setEquippedItem(BancItem equippedItem) {
        this.equippedItem = equippedItem;
    }

    public BancItem getEquippedItem() {
        return equippedItem;
    }
}
