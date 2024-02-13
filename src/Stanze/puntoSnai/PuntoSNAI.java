package Stanze.puntoSnai;

import Input.In;
import Main.GamePanel;



public class PuntoSNAI {
	public void runPSNAI() {

		int scelta;

		do {
			System.out.println("Soldi: " + GamePanel.giocatore.getSoldi() + " HP: " + GamePanel.giocatore.getHP());
			System.out.println(" ");
			System.out.println("Sei nel Punto SNAI, Cosa vuoi fare?");
			System.out.println("1. Giocare alle slot");
			//System.out.println("2. WIP");
			System.out.println("0. Esci");

			scelta = In.scanner.nextInt();
			GamePanel.clearScreen();

			switch (scelta) {
			case 1:
                GamePanel.clearScreen();
                Slot.runSlot();
                break;


//			case 2:
//				System.out.println("3. WIP");
//				break;

			case 0:
				System.out.println("Bella zi");
				break;
			}

		} while (scelta != 3);

	}

}