package Stanze.bar.oggetti;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

public class Bottiglia implements ConsumableItems {
    private Integer quantita = 1;

    @Override
    public void consumeItem() {

    }

    @Override
    public int healAmount() {
        return 0;
    }

    @Override
    public int getQuantity() {
        return this.quantita;
    }

    @Override
    public void increaseQuantity() {
        this.quantita ++;
    }
}
