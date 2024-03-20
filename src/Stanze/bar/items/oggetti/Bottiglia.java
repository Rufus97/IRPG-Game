package Stanze.bar.items.oggetti;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

import java.util.Objects;


public class Bottiglia implements ConsumableItems {
    private String nome = "bottiglia";
    private Integer quantita = 1;

    @Override
    public String getName() {
        return nome;
    }
    @Override
    public void consumeItem() {
        quantita--;
    }

    @Override
    public int healAmount() {
        return 0;
    }

    @Override
    public int getQuantity() {
        return quantita;
    }

    @Override
    public void increaseQuantity() {
        quantita++;
    }

    @Override
    public String toString() {
        return "Bottiglia{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                '}';
    }
}