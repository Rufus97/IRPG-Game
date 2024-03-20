package Stanze.Cantiere.Materials;

import Player.CharacterEquipment.InventoryNew.MaterialItems;

public class Rame implements MaterialItems {

    private int quantity = 1;
    private int upgradeValue = 3;
    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void increaseQuantity() {
    quantity++;
    }

    @Override
    public int upgradeWep() {
    return upgradeValue;
    }

    @Override
    public void consumeItem() {
        this.quantity--;
    }

    @Override
    public String toString() {
        return "Rame{" +
                "quantity=" + quantity +
                ", upgradeValue=" + upgradeValue +
                '}';
    }
}
