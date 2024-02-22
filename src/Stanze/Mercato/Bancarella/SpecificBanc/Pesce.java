package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.BancItem;

public class Pesce extends BancItem {

    public Pesce(String fishName, double prezzoAlKg){
        super.setItemName(fishName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc(BancType.PESCE);
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo al Kg: " + super.getPrezzoAlKg() +
                '}';
    }
}
