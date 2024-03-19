package Stanze.Mercato.Bancarella;

import Player.CharacterEquipment.InventoryNew.Inventory;

import java.util.Objects;

public abstract class BancItem implements Inventory{
    private double prezzoAlKg;
    private String itemName;
    private double price;
    private String typeOfBanc;

    private int quantita =1;
    public BancItem(){
    }

    @Override
    public int getQuantity() {
        return this.quantita;
    }
    public String getTypeOfBanc() {return typeOfBanc;}
    public double getPrice() {return price;}
    public double getPrezzoAlKg() {
        return prezzoAlKg;
    }
    public String getItemName() {
        return itemName;
    }
    public void setPrezzoAlKg(double prezzoAlKg) {
        this.prezzoAlKg = prezzoAlKg;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTypeOfBanc(String typeOfBanc) {
        this.typeOfBanc = typeOfBanc;
    }


    @Override
    public void increaseQuantity() {
        this.quantita ++;
    }

    public void consumeQuantity(){this.quantita--;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BancItem bancItem = (BancItem) o;
        return Objects.equals(itemName, bancItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }

    @Override
    public String toString() {
        return

                "Item name: " + itemName + '\'' +
                "prezzo al Kg: " + prezzoAlKg +
                "prezzo: " + price +
                '}';
    }

}
