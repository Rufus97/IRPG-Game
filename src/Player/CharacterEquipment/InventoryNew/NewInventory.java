package Player.CharacterEquipment.InventoryNew;

import Stanze.Mercato.MercatoInputs;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class NewInventory {

    private Map<Integer, Inventory> backpack = new HashMap<>();
    private static NewInventory inventory = new NewInventory();
    private NewInventory(){}
    MercatoInputs input = new MercatoInputs();

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
            if (item instanceof EquippableItems){
                System.out.println("equip it? \n1: yes \n2: no");
                if(input.getInt() == 1){
                    ((EquippableItems) item).equipItem();
                    System.out.println("equipped " + item);
                } else {

                }
            }
        } else {

            item.increaseQuantity();
            return newMap;
        }
        return newMap;
    }
    public boolean checkIfExists(Inventory map, Map<Integer, Inventory> mappa){

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

    public Map<Integer, ConsumableItems> getAllConsumables(){
        Map<Integer, ConsumableItems> equip = new HashMap<>();
        for (Map.Entry<Integer, Inventory> entries : backpack.entrySet()){
            if (entries.getValue() instanceof ConsumableItems){
                equip.put(getNewKey(equip), (ConsumableItems) entries.getValue());
            }
        }
        return equip;
    }

    public void consumeAnItem(ConsumableItems item){
        if (item.getQuantity() > 0){
            item.consumeItem();
        } else { System.out.println("not enough " + item);}
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

