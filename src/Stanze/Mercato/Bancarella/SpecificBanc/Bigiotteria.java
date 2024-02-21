package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;
import Stanze.Mercato.Bancarella.MarketObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigiotteria extends Bancarella implements MarketObjects {
    public Bigiotteria(String bigioName, double prezzo){
        super.setBancName(bigioName);
        super.setPrice(prezzo);
        super.setTypeOfBanc(BancType.BIGIOTTERIA);
    }
    public void fillBanc(){
        super.getMapOfBancs().put(BancType.BIGIOTTERIA, BancType.BIGIOTTERIA.getInventory());
    };
}
