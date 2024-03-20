package Player.CharacterEquipment.InventoryNew;

import Input.In;
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
                }
            }
        } else {
            System.out.println("sono entrato qua dentro");
            item.increaseQuantity();
            return newMap;
        }
        return newMap;
    }
    public boolean checkIfExists(Inventory map, Map<Integer, Inventory> mappa){

        boolean foundFlag = false;
        for (Map.Entry<Integer, Inventory> element : mappa.entrySet()){
            if (element.getValue().getName().equalsIgnoreCase(map.getName())){
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
        cleanBackPack();
    }
    public void consumeAMaterial(MaterialItems item){
        if (item.getQuantity() > 0){
            item.consumeItem();
        } else { System.out.println("not enough " + item);}
        cleanBackPack();
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

    public void cleanBackPack(){
        List<Inventory> goodValues = new ArrayList<>();
        for (Map.Entry<Integer, Inventory> entry : this.getBackpack().entrySet()){
            if (entry.getValue().getQuantity() > 0){
                goodValues.add(entry.getValue());
            }
        }
        Map<Integer, Inventory> cleanBackPack = new HashMap<>();
        for (Inventory value : goodValues){
            cleanBackPack.put(getNewKey(cleanBackPack), value);
        }
        setBackpack(cleanBackPack);
    }
    public Map<Integer, MaterialItems> getAllMaterials(){
    Map<Integer, MaterialItems> materials = new HashMap<>();
        for (Map.Entry<Integer, Inventory> entry : this.getBackpack().entrySet()){
            if (entry.getValue() instanceof MaterialItems){
                materials.put(getNewKey(materials), (MaterialItems) entry.getValue());
            }
        }
    return materials;
    }
    public void upgradeAnItem(){
      System.out.println("chose a material");
      System.out.println(getAllMaterials());
      MaterialItems chosedMat = getAllMaterials().get(In.inputInt());
      System.out.println("chose an equip");
      System.out.println(getAllEquipment());
      getAllEquipment().get(In.inputInt()).setArmor(chosedMat.upgradeWep());
      chosedMat.consumeItem();

    }

    public void setBackpack(Map<Integer, Inventory> backpack) {
        this.backpack = backpack;
    }
}

