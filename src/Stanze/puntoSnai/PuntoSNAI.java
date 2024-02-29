package Stanze.puntoSnai;

import Input.In;
import Main.GamePanel;

public class PuntoSNAI {
	public void runPSNAI() {

		int scelta;

		do {
			GamePanel.giocatore.mostraStatistiche();
			System.out.println(" ");
			System.out.println("Sei nel Punto SNAI, Cosa vuoi fare?");
			System.out.println("1. Giocare alle slot");
			System.out.println("2. Giocare ai cavalli");
			System.out.println("0. Esci");
			GamePanel.clearScreen();
			scelta = In.scanner.nextInt();
			GamePanel.clearScreen();

			switch (scelta) {
			case 1:
				GamePanel.clearScreen();
				Slot.runSlot();
				break;

			case 2:
				GamePanel.clearScreen();
				HorseP.runHorses();
				break;

			case 0:
				System.out.println("Bella zi");
				break;
			}

		} while (scelta != 0);

	}

}