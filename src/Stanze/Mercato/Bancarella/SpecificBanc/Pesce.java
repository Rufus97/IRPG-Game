package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;
import Stanze.Mercato.Bancarella.MarketObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pesce extends Bancarella implements MarketObjects {

    public Pesce(String fishName, double prezzoAlKg){
        super.setBancName(fishName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc(BancType.PESCE);
    }
    public void fillBanc(){
        super.getMapOfBancs().put(BancType.PESCE, BancType.PESCE.getInventory());
    };
}
