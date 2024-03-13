package Main;


import Input.In;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.CharEquip;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.ConsumableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.Inventory;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.RandomEvents.Napoletano;
import Stanze.Mercato.AzioniMercato.RandomEvents.NapoliEnum;
import Stanze.Mercato.AzioniMercato.Utility.Scontro;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.SpecificBanc.Vestiti;
import Stanze.Mercato.MercatoInputs;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		NapoliEnum ciro = NapoliEnum.NORMALE;
		Scontro due = new Scontro();
		due.scontro(GamePanel.giocatore, ciro);


	}

}

