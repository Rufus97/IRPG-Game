package Stanze.Mercato.Logic;

import Input.Casuale;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.BancItem;

import java.util.*;

public class Market {

    private Map<Integer, List<BancItem>> mapOfBancs = new HashMap<>();

    public Market(){
        for (Integer i = 0; i < BancType.values().length; i++){
            this.mapOfBancs.put(i, BancType.values()[i].getInventory());
        }
    }

    public Map<Integer, List<BancItem>> getMapOfBancs() {
        return mapOfBancs;
    }

    public List<BancItem> getOneRandomInventory(Integer key){
        List<BancItem> newInventory = this.mapOfBancs.get(key);
        List<BancItem> newRngInventory = new ArrayList<>();

        for (int index = 2; index < newInventory.size(); index++){
            int rngWichItems = Casuale.numeroCasualeTra(0, newInventory.size()-1);
            if (!newRngInventory.contains(newInventory.get(rngWichItems))){
            newRngInventory.add(newInventory.get(rngWichItems));
            }
        }
        return newRngInventory;
    }
}
