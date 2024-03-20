package Main;
import Input.In;
import Player.CharacterEquipment.CharEquip;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.Inventario;
import Player.Personaggio;
import Stanze.Mercato.MercatoInputs;
import java.io.IOException;
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

			System.out.println("...storiella");
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
				System.out.println("Nell inventario hai:");
				System.out.println(NewInventory.getInventory().getBackpack());
				System.out.println("Ulteriori operazioni? \n1: Equipaggia oggetto \n2: Usa oggetto \n3: upgrade an item \n0: esci");
				int choice2 = In.inputInt();
				switch (choice2){
					case 1 -> {System.out.println(NewInventory.getInventory().getAllEquipment());
					CharEquip.getPlayerEquipment().equipItem(new MercatoInputs());
					}
					case 2 -> {System.out.println(NewInventory.getInventory().getAllConsumables());
					System.out.println("chose an item");
						ConsumableItems item = NewInventory.getInventory().getAllConsumables().get(In.inputInt());
						NewInventory.getInventory().consumeAnItem(item);
					}
					case 3 ->{NewInventory.getInventory().upgradeAnItem();

					}
					case 0 -> {}
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
