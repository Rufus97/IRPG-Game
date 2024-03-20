package Stanze.bar.items.oggetti;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.Inventory;

public class Accendino implements ConsumableItems {

    private Integer quantita = 1;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void increaseQuantity() {
        this.quantita++;
    }

    @Override
    public void consumeItem() {
        this.quantita--;
    }

    @Override
    public int healAmount() {
        return 0;
    }
}
