package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;
import Stanze.Mercato.Bancarella.MarketObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vestiti extends Bancarella implements MarketObjects {

    public Vestiti(String clothName, double prezzo){
        super.setBancName(clothName);
        super.setPrice(prezzo);
        super.setTypeOfBanc(BancType.VESTITI);
    }

    public void fillBanc(){
            super.getMapOfBancs().put(BancType.VESTITI, BancType.VESTITI.getInventory());
    };
}
