package Player.CharacterEquipment.InventoryNew;

public interface EquippableItems extends Inventory {

    public int getArmor();
    public void equipItem();
    public int getDanni();
    public void setArmor(int upgrade);
}
