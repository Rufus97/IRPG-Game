package Stanze.Tabacchino.itemsTabacchino.items;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

public class Cartine implements ConsumableItems {

    private String nome = "Cartine";
    private int quantita = 50;

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
        return "Cartine{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                '}';
    }
}
