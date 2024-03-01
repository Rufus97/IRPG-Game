package Stanze.Mercato.Bancarella.SpecificBanc;
import Stanze.Mercato.Bancarella.BancItem;

public class Vestiti extends BancItem {

    public Vestiti(String clothName, double prezzo){
        super.setItemName(clothName);
        super.setPrice(prezzo);
        super.setTypeOfBanc("barbon shop");
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo: " + super.getPrice() +
                '}';
    }
}
