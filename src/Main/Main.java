package Main;


import Input.In;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.CharEquip;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.ConsumableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.Inventory;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.SpecificBanc.Vestiti;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Map<Integer, String> newInventory = new HashMap<Integer, String>();
		newInventory = addToBackpack("ciao", newInventory);
		newInventory = addToBackpack("bibi", newInventory);
		newInventory = addToBackpack("simona bocchinona", newInventory);
		newInventory = addToBackpack("nikitina al sugo", newInventory);
		newInventory = addToBackpack("ciao", newInventory);
		newInventory = addToBackpack("simona bocchinona", newInventory);
		newInventory = addToBackpack("wuoahwuw", newInventory);

        System.out.println(newInventory);
	}
	public static Map<Integer, String> addToBackpack(String item, Map<Integer, String> map){
		Map<Integer, String> newMap = map;
		if (!checkIfExists(item, map)){
			newMap.put(getNewKey(newMap), item);
		} else {
			return newMap;
		}
		return newMap;
	}
	public static boolean checkIfExists(String map, Map<Integer, String> mappa){

		boolean foundFlag = false;
			for (Map.Entry<Integer, String> element : mappa.entrySet()){
				 if (element.getValue().equals(map)){
					 foundFlag = true;
				 }
			}
		return foundFlag;
	}
	public static Integer getNewKey(Map<Integer,?> map){

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
}

