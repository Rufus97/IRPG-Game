package Stanze.Tabacchino.itemsTabacchino.items;

import Player.CharacterEquipment.InventoryNew.ConsumableItems;

public class FiltriRizla implements ConsumableItems {

    private String nome = "Fitri Rizla";
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
        return "FiltriRizla{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                '}';
    }
}
