package Main;

import Input.In;
import Player.Inventario;
import Player.Personaggio;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.CharEquip;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.Inventory;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.MercatoInputs;
import Stanze.Stanza;
import Stanze.puntoSnai.HorseP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GamePanel {

	public static final Personaggio giocatore = new Personaggio();
	public static final Inventario inventario = new Inventario(); // far vedere

	// costruttore
	public GamePanel() {
	}

	public void startGame() {


		int scelta;

		// Loop menu
		do {
			System.out.println("Cosa vuoi fare?");
			System.out.println("1. Vai a...");
			System.out.println("2. Apri Inventario...");
			System.out.println("0. Esci dal gioco");
			scelta = In.inputInt();
			GamePanel.clearScreen();
			switch (scelta) {
			case 1:
				Menu menu = new Menu();
				menu.VaiA();
				break;

			case 2:
				System.out.println("Nell'inventario hai:");
				System.out.println(NewInventory.getInventory().getBackpack());
				try{
					CharEquip.getPlayerEquipment().equipItem(new MercatoInputs());
					break;
				} catch (Exception e){
					System.out.println("indice errato");
				}

			case 0:
				System.out.println("Exit Game");
				break;

			default:
				System.out.println("Scelta errata");
				break;
			}

		} while (scelta != 0);
	}

	// METODO CANCELLA SCHERMO
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void prova() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
}
