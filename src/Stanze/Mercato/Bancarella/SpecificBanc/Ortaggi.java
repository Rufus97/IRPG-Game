package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;
import Stanze.Mercato.Bancarella.MarketObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ortaggi extends Bancarella implements MarketObjects {


    public Ortaggi(String ortaggiName, double prezzoAlKg){
        super.setBancName(ortaggiName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc(BancType.ORTAGGI);
    }
    public void fillBanc(){
        super.getMapOfBancs().put(BancType.ORTAGGI, BancType.ORTAGGI.getInventory());
    };
}
