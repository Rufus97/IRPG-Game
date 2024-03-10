package Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class NewInventory {

    private Map<Integer, Inventory> backpack = new HashMap<>();
    private static NewInventory inventory = new NewInventory();
    private NewInventory(){}

    public static NewInventory getInventory() {
        return inventory;
    }
    public Map<Integer, Inventory> getBackpack() {
        return backpack;
    }
    public  Map<Integer, Inventory> addToBackpack(Inventory item){
        Map<Integer, Inventory> newMap = backpack;
        if (!checkIfExists(item, backpack)){
            newMap.put(getNewKey(newMap), item);
        } else {
            item.setQuantity();
            return newMap;
        }
        return newMap;
    }
    public  boolean checkIfExists(Inventory map, Map<Integer, Inventory> mappa){

        boolean foundFlag = false;
        for (Map.Entry<Integer, Inventory> element : mappa.entrySet()){
            if (element.getValue().equals(map)){
                foundFlag = true;
            }
        }
        return foundFlag;
    }
    public  Integer getNewKey(Map<Integer,?> map){

        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        Integer key = 0;
        if (map.isEmpty()){
            key = 1;
        } else {
            while(it.hasNext()){
                key = it.next();
                if(!it.hasNext()){
                    key++;
                }
            }
        }
        return key;
    }

    public Map<Integer, EquippableItems> getAllEquipment(){
        Map<Integer, EquippableItems> equip = new HashMap<>();
        for (Map.Entry<Integer, Inventory> entries : backpack.entrySet()){
            if (entries.getValue() instanceof EquippableItems){
                equip.put(getNewKey(equip), (EquippableItems) entries.getValue());
            }
        }
        return equip;
    }
}

