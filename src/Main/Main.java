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
import Stanze.Mercato.MercatoInputs;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		CharEquip pippo = CharEquip.getPlayerEquipment();
		NewInventory inv = NewInventory.getInventory();
		List<BancItem> items = BancType.VESTITI.getInventory();
		List<BancItem> items2 = BancType.PESCE.getInventory();
		inv.addToBackpack(items.get(0));
		inv.addToBackpack(items2.get(1));
		inv.addToBackpack(items.get(2));
		inv.addToBackpack(items2.get(2));


		pippo.equipItem(new MercatoInputs());


	}

}

