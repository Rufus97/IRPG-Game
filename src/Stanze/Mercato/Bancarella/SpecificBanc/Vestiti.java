package Stanze.Mercato.Bancarella.SpecificBanc;
import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.Bancarella.BancItem;

public class Vestiti extends BancItem implements EquippableItems {
    private int armorValue;
    private EquipSlot slot;
    public Vestiti(String clothName, double prezzo, int armor, EquipSlot slot){
        super.setItemName(clothName);
        super.setPrice(prezzo);
        super.setTypeOfBanc("barbon shop");
        this.armorValue = armor;
        this.slot = slot;
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo: " + super.getPrice() +
                " armatura: " + this.armorValue +
                '}';
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }

    @Override
    public int getArmor() {
        return this.armorValue;
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
        return 0;
    }

    @Override
    public void setArmor(int upgrade) {
        this.armorValue += upgrade;
    }

    @Override
    public String getItemName() {
        return super.getItemName();
    }

    @Override
    public String getName() {
        return super.getItemName();
    }
}
