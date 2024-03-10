package Main;


import Input.In;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.CharEquip;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.ConsumableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.Inventory;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.RandomEvents.Napoletano;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.SpecificBanc.Vestiti;
import Stanze.Mercato.MercatoInputs;

import java.util.*;

public class Main {
	public static void main(String[] args) {
        NewInventory pippo2 = NewInventory.getInventory();
		CharEquip pippo = CharEquip.getPlayerEquipment();
        List<BancItem> myBack = BancType.VESTITI.getInventory();
        pippo2.addToBackpack(myBack.get(0));
		pippo2.addToBackpack(myBack.get(2));
		pippo2.addToBackpack(myBack.get(1));
		pippo2.addToBackpack(myBack.get(0));
		pippo2.addToBackpack(myBack.get(5));
		pippo2.addToBackpack(myBack.get(4));
		pippo2.addToBackpack(myBack.get(0));
		pippo2.addToBackpack(myBack.get(3));
		pippo.equipItem(new MercatoInputs());
		System.out.println(pippo.getAllArmor());

	}

}

