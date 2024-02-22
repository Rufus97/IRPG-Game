package Stanze.Mercato.Logic;

import Input.Casuale;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.BancItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Market {

    private Map<Integer, List<BancItem>> mapOfBancs = new HashMap<>();
    private Map<Integer, BancItem> mapOfItems = new HashMap<>();

    public Market(){
        for (Integer i = 0; i < BancType.values().length; i++){
            this.mapOfBancs.put(i, BancType.values()[i].getInventory());
        }
    }

    public Map<Integer, List<BancItem>> getMapOfBancs() {
        return mapOfBancs;
    }
}
