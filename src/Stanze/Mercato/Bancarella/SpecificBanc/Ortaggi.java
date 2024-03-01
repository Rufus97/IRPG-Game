package Stanze.Mercato.Bancarella.SpecificBanc;


import Stanze.Mercato.Bancarella.BancItem;

public class Ortaggi extends BancItem {


    public Ortaggi(String ortaggiName, double prezzoAlKg){
        super.setItemName(ortaggiName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("tra oltraggi e ortaggi");
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo al Kg: " + super.getPrezzoAlKg() +
                '}';
    }
}