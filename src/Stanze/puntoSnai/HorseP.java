package Stanze.puntoSnai;

import java.util.HashMap;
import java.util.Map;

import Input.Casuale;
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
	    GamePanel.clearScreen();
	    double karma = GamePanel.giocatore.getKarma();
	    int cavalliNumero = Casuale.numeroCasualeTra(6, 12);

	    for (int i = 0; i < 20; i++) { // Per 20 tick
	        GamePanel.clearScreen();
	        StringBuilder output = new StringBuilder();
	        
	        for (Map.Entry<Integer, Cavallo> entry : cavalli.entrySet()) {
	            Cavallo cavallo = entry.getValue();
	            StringBuilder distanza = cavallo.getDistanza();
	            int index = distanza.indexOf("□"); // Trova l'indice della prima casella vuota
	            if (index != -1) { // Se c'è almeno una casella vuota
	                distanza.setCharAt(index, '■'); // Riempie la casella vuota più vicina da sinistra
	            }
	            output.append(cavallo.getNome()).append(" ").append(distanza).append("\n");
	        }
	        
	        System.out.println(output.toString());

	        try {
	        	Thread.sleep(1100);
	        	GamePanel.clearScreen();
	            Thread.sleep(1000); // Attendi 200ms tra i tick
	            
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
