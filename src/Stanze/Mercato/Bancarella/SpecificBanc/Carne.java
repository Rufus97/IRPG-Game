package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;
import Stanze.Mercato.Bancarella.MarketObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carne extends Bancarella implements MarketObjects {

    public Carne(String meatName, double prezzoAlKg){
        super.setBancName(meatName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc(BancType.CARNE);
    }
    public void fillBanc(){
        super.getMapOfBancs().put(BancType.CARNE, BancType.CARNE.getInventory());
    };
}
