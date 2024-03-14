package Stanze.Parco.BruEntity;

import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;

public class Bycycle implements EquippableItems {
    private String name = "bicicletta";
    private int dmg;


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
    public void setQuantity() {

    }
}
