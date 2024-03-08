package Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
    public void addToBackpack(Inventory item){
        Set<Integer> backpackKeys = backpack.keySet();
        cleanBackpack(item);
        if (backpackKeys.isEmpty()){
            backpack.put(1, item);
        }  else  {
            backpack.put(backpackKeys.size()+1, item);
        }
    }


    public void cleanBackpack(Inventory item){
        Set<Map.Entry<Integer, Inventory>> repeatedEntries = new HashSet<>();
        AtomicInteger counter = new AtomicInteger(0);
        backpack.entrySet().forEach(( v) ->{
            counter.getAndIncrement();
            if (counter.get() == 1){
            }
            if (v.getValue().equals(item)){
                repeatedEntries.add( v);
            }
            });
        repeatedEntries.forEach(k -> {
            k.getValue().setQuantity();
            backpack.remove(k.getKey());
        });
    }

    public void getAllEquipment(){
        backpack.forEach((k,v) ->{
            if (v instanceof EquippableItems){
            System.out.println(k + ": " + v);
            }
        });
    }
}

