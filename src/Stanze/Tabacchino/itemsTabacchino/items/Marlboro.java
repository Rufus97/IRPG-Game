package Stanze.Tabacchino.itemsTabacchino.items;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

public class Marlboro implements ConsumableItems {


    private String nome = "Marlboro rosse";
    private int quantita = 20;

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
        return "Marlboro{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                '}';
    }
}
