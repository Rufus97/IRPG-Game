package Stanze.Tabacchino.itemsTabacchino.items;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

public class TabaccoLS implements ConsumableItems {

    public static TabaccoLS tabaccoLS = new TabaccoLS();

    private String nome = "Tabacco Lucky Strike";
    private int quantita = 30;

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
        return "TabaccoLS {" +
                "nome: '" + nome + '\'' +
                ", grammi: " + quantita +
                '}';
    }
}
