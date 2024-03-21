package Main;

import Input.In;
import Stanze.Ospedale;
import Stanze.Questura;
import Stanze.Stanza;
import Stanze.bar.Azione;
import Stanze.bar.Bar;
import Stanze.Tabacchino.Tabacchino;
import Stanze.puntoSnai.PuntoSNAI;
import Stanze.Cantiere.Cantiere;
import Stanze.Parco.Parchetto;
import Stanze.Mercato.*;

import java.util.HashMap;
import java.util.Map;


public class Menu {

	Map<Integer, Stanza> stanze = new HashMap<>();

	public Menu() {
		stanze.put(1,new Tabacchino());
		stanze.put(2,new Bar());
		stanze.put(3,new Cantiere());
		stanze.put(4,new PuntoSNAI());
		stanze.put(5,new Parchetto());
		stanze.put(6,new Mercato());
		//stanze.put(7,new Ospedale());
		//stanze.put(8,new Questura());
	}

	public void VaiA() {
		int scelta;
		do {
			GamePanel.giocatore.mostraStatistiche();

			for (Map.Entry<Integer, Stanza> elemento : stanze.entrySet()) {
				System.out.println(elemento.getKey() + ". " + elemento.getValue().getNomeStanza());
			}
			System.out.println("0. Esci");

			scelta = In.inputForMaps(stanze);
			GamePanel.clearScreen();

			if (scelta != 0) {
				this.stanze.get(scelta).runStanza();
			}

		}while (scelta != 0);

	}
}
