package Stanze.bar.items.oggetti;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

public class Fumo implements ConsumableItems {

    private String nome = "Fumo";
    private int quantita = 1;

    public static Fumo fumo = new Fumo();

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
        return "Fumo{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                '}';
    }
}
