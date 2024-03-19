package Main;

import Main.Utility.Scontro;
import Player.CharacterEquipment.CharEquip;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.RandomEvents.NapoliEnum;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.MercatoInputs;
import Stanze.Parco.BruEntity.BruEnt;
import Stanze.Parco.BruEntity.Bycycle;

public class Main {
	public static void main(String[] args) {

	  NewInventory.getInventory().addToBackpack(new Bycycle());
		CharEquip.getPlayerEquipment().equipItem(new MercatoInputs());
		Scontro a = new Scontro();
		a.scontro(GamePanel.giocatore, new BruEnt());
	}

}

