package Stanze.Mercato.AzioniMercato.CharacterEquipment;

import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.Inventory;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;

public enum EquipSlot {
    HEAD(false, null, "Testa"),
    TORSO(false, null, "Torso"),
    BELT(false, null, "Cinta"),
    LEGS(false, null, "Gambe"),
    FEET(false, null, "Piedi"),
    HANDS(false, null, "Mani"),
    ACCESSORY(false, null, "Accessorio"),
    RING_ONE(false, null, "Anello 1"),
    RING_TWO(false, null, "Anello 2"),
    WEAPON(false, null, "Arma")
    ;

    private boolean isEquipped;

    private Inventory equippedItem;

    private String slotName;



    private EquipSlot(boolean isEquipped, Inventory equippedItem, String name){

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

    public Inventory getEquippedItem() {
        return equippedItem;
    }
}
