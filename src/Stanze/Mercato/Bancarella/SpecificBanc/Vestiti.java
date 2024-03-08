package Stanze.Mercato.Bancarella.SpecificBanc;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.Bancarella.BancItem;

public class Vestiti extends BancItem implements EquippableItems {
    private int armorValue;
    public Vestiti(String clothName, double prezzo, int armor){
        super.setItemName(clothName);
        super.setPrice(prezzo);
        super.setTypeOfBanc("barbon shop");
        this.armorValue = armor;
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo: " + super.getPrice() +
                " quantita: " + super.getQuantity() +
                '}';
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public void equipItem() {

    }
}
