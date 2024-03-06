package Stanze.puntoSnai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Input.Casuale;
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
		//double karma = GamePanel.giocatore.getKarma();
		//int cavalliNumero = Casuale.numeroCasualeTra(6, 12);
		boolean isRaceOver=false;
		StringBuilder output = new StringBuilder();
		
		while (!isRaceOver) {
		for (Cavallo cavalloMovente : cavalli) {
			StringBuilder distanza = cavalloMovente.getDistanza();
			int emptyIndex = distanza.indexOf("□");
			
			if (emptyIndex <=distanza.length()) {
				distanza.setCharAt(emptyIndex, '■');
			}
			//Creazione output
			output.append(cavalloMovente.getNome()).append(distanza).append("\n");
		}
		System.out.println(output.toString());

		try {
			Thread.sleep(100);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

}
