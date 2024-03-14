package Stanze.puntoSnai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Input.Dado;
import Main.GamePanel;
import Stanze.puntoSnai.cavalli.Cavallo;

// "\uD83D\uDC0E"
// "\uD83D\u25CB"
// "\uD83D\u25CF"
public class HorseP {
	private static Map<Integer, Cavallo> cavalli = new HashMap<>();

	public HorseP() {
		cavalli.put(1, new Cavallo("Pasquale "));
		cavalli.put(2, new Cavallo("Shadow   "));
		cavalli.put(3, new Cavallo("Spirit   "));
		cavalli.put(4, new Cavallo("Midnight "));
		cavalli.put(5, new Cavallo("Bella    "));
		cavalli.put(6, new Cavallo("Apollo   "));
		cavalli.put(7, new Cavallo("Dusty    "));
		cavalli.put(8, new Cavallo("Rusty    "));
		cavalli.put(9, new Cavallo("Whisper  "));
		cavalli.put(10, new Cavallo("Stormy   "));
		cavalli.put(11, new Cavallo("Blaze    "));
		cavalli.put(12, new Cavallo("Sunny    "));
	}

	public static void runHorses() {
		double karma = GamePanel.giocatore.getKarma();
		boolean isRaceOver = false;
		int winnerStud = 0;
		double vincita = 0;
		Dado dado = new Dado();
		System.out.println("I tuoi soldi " + GamePanel.giocatore.getSoldi());
		System.out.println("Da quanto la giocata? min 1 max 4 euro");
		double costoPartita = (Input.In.scanner.nextInt() * -1);
		System.out.println("Su quale cavallo punti?");
		System.out.println("1. Pasquale \n2. Shadow \n3. Spirit \n4. Midnight \n5. Bella \n6. Apollo "
				+ "\n7. Dusty \n8. Rusty \n9. Whisper \n10. Stormy \n11. Blaze \n12. Sunny ");
		int selezioneCavallo = (Input.In.scanner.nextInt());
		do {

			StringBuilder output = new StringBuilder();
			for (Entry<Integer, Cavallo> cavalloMovente : cavalli.entrySet()) {

				StringBuilder distanza = cavalloMovente.getValue().getDistanza();
				int emptyIndex = distanza.indexOf("□");
				int incremento;
				incremento = Input.Casuale.numeroCasualeTra(1, 3);

				for (int i = 0; i < incremento; i++) {
					if (dado.getDado(1, 20)>13 && cavalloMovente.getKey()==selezioneCavallo) {
						incremento=+1;
					}
					int indexTemp = emptyIndex + i;
					if (indexTemp >= 0 && indexTemp <= distanza.length() - 1 && indexTemp != distanza.length()) {
						distanza.setCharAt(emptyIndex + i, '■');
					} else {
						isRaceOver = true;
						winnerStud = cavalloMovente.getKey();
						if (winnerStud == selezioneCavallo) {
							vincita = costoPartita*12*-1;
						}
						break;

					}
				}

				output.append(cavalloMovente.getValue().getNome()).append(distanza).append("\n");
				if (isRaceOver)
					break;

			}
			GamePanel.clearScreen();
			System.out.println(output.toString());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!isRaceOver); // hai vinto??
		if (vincita > 0) {
			System.out.println("Il cavallo vincente è " + cavalli.get(winnerStud).getNome() + " hai vinto: " + vincita);
			System.out.println(vincita);
		} else {
			System.out.println(vincita);
			System.out.println("Il cavallo vincente è " + cavalli.get(winnerStud).getNome() + " \nMi spiace non vinci nulla");
		}

	}

}