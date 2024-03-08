package Stanze.Mercato.AzioniMercato.CharacterEquipment;

public enum EquipSlot {
    HEAD(false),
    TORSO(false),
    LEGS(false),
    FEET(false),
    HANDS(false);

    private boolean isEquipped;
    private EquipSlot(boolean isEquipped){
        this.isEquipped = isEquipped;
    }
    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}
