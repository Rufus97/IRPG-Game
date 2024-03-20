package Stanze.Parco.CannaItems;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.Inventory;

import java.util.Objects;

public class Erba implements ConsumableItems{
    private String name = "Erbozzo";
    private int quantity = 1;

    public static Erba erbosa = new Erba();
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void consumeItem() {
        this.quantity--;
    }
    @Override
    public int healAmount() {
        return 0;
    }
    @Override
    public int getQuantity() {
        return quantity;
    }
    @Override
    public void increaseQuantity() {
        this.quantity++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Erba erba = (Erba) o;
        return Objects.equals(name, erba.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Erba {" +
                "name: '" + name + '\'' +
                ", quantity: " + quantity +
                '}';
    }
}
