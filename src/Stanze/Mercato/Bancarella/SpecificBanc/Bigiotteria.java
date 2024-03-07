package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancItem;

public class Bigiotteria extends BancItem {
    public Bigiotteria(String bigioName, double prezzo){
        super.setItemName(bigioName);
        super.setPrice(prezzo);
        super.setTypeOfBanc("cazzatine & collanine");
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo: " + super.getPrice() +
                '}';
    }
}
