package Stanze.puntoSnai;

import java.util.ArrayList;
import Main.GamePanel;
import Stanze.puntoSnai.cavalli.Cavallo;

// "\uD83D\uDC0E"
// "\uD83D\u25CB"
// "\uD83D\u25CF"
public class HorseP {
	private static ArrayList<Cavallo> cavalli = new ArrayList<>();

	public HorseP() {
		cavalli.add(new Cavallo("Pasquale "));
		cavalli.add(new Cavallo("Shadow   "));
		cavalli.add(new Cavallo("Spirit   "));
		cavalli.add(new Cavallo("Midnight "));
		cavalli.add(new Cavallo("Bella    "));
		cavalli.add(new Cavallo("Apollo   "));
		cavalli.add(new Cavallo("Dusty    "));
		cavalli.add(new Cavallo("Rusty    "));
		cavalli.add(new Cavallo("Whisper  "));
		cavalli.add(new Cavallo("Stormy   "));
		cavalli.add(new Cavallo("Blaze    "));
		cavalli.add(new Cavallo("Sunny    "));
	}

	public static void runHorses() {
		// double karma = GamePanel.giocatore.getKarma();
		// int cavalliNumero = Casuale.numeroCasualeTra(6, 12);
		boolean isRaceOver = false;
		Cavallo winnerStud = null;
		int vincita = 0;
		System.out.println("I tuoi soldi " + GamePanel.giocatore.getSoldi());
		System.out.println("Da quanto la giocata? min 1 max 4 euro");
		double costoPartita = (Input.In.scanner.nextInt() * -1);
		System.out.println("Su quale cavallo punti?");
		System.out.println(
				"1. Pasquale \n2. Shadow \n3. Spirit \n4. Midnight \n5. Bella \n6. Apollo \n7. Dusty \n8. Rusty \n9. Whisper \n10. Stormy \n11. Blaze \n12. Sunny ");
		int selezioneCavallo = (Input.In.scanner.nextInt() * -1);
		do {

			StringBuilder output = new StringBuilder();
			for (Cavallo cavalloMovente : cavalli) {

				StringBuilder distanza = cavalloMovente.getDistanza();
				int emptyIndex = distanza.indexOf("□");
				int incremento;
				incremento = Input.Casuale.numeroCasualeTra(1, 3);

				for (int i = 0; i < incremento; i++) {
					int indexTemp = emptyIndex + i;
					if (indexTemp >= 0 && indexTemp <= distanza.length() - 1 && indexTemp != distanza.length()) {
						distanza.setCharAt(emptyIndex + i, '■');
					} else {
						isRaceOver = true;
						winnerStud = cavalloMovente;
						break;
					}
				}

				output.append(cavalloMovente.getNome()).append(distanza).append("\n");
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
			System.out.println("Il cavallo vincente è " + winnerStud.getNome() + " hai vinto: " + vincita);
		} else {
			System.out.println("Il cavallo vincente è " + winnerStud.getNome() + " \nMi spiace non vinci nulla");
		}

	}

}