package Main;


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


		   List<BancItem> pippo2 = BancType.VESTITI.getInventory();

		for (BancItem element : pippo2){
			if (element instanceof Inventory){
				System.out.println(element);
			}else {
				System.out.println(" non trovato ");
			}
		}
		NewInventory backpackHero = NewInventory.getInventory();


		backpackHero.addToBackpack(pippo2.get(2));
		backpackHero.addToBackpack(pippo2.get(2));
		backpackHero.addToBackpack(pippo2.get(2));
		backpackHero.addToBackpack(pippo2.get(1));
		backpackHero.addToBackpack(pippo2.get(1));
		backpackHero.addToBackpack(pippo2.get(3));
		backpackHero.addToBackpack(pippo2.get(3));
		backpackHero.addToBackpack(pippo2.get(3));
		backpackHero.addToBackpack(pippo2.get(3));
		backpackHero.addToBackpack(pippo2.get(5));

		System.out.println(backpackHero.getBackpack());
		backpackHero.getAllEquipment();
		}

	}

