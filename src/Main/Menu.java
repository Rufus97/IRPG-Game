package Main;

import Input.In;
import Stanze.Bar.Bar;
import Stanze.Tabacchino.Tabacchino;
import Stanze.puntoSnai.PuntoSNAI;
import Stanze.Cantiere.Cantiere;
import Stanze.Parco.Parchetto;
import Stanze.Questura;
import Stanze.Mercato.Mercato;

import javax.xml.parsers.ParserConfigurationException;

public class Menu {

	Tabacchino tabachino;

	public static void VaiA() {
		int scelta;

		do {
			System.out.println("Dove vuoi andare?");
			System.out.println("1. Tabacchino");
			System.out.println("2. Bar");
			System.out.println("3. Cantiere");
			System.out.println("4. Punto SNAI");
			System.out.println("5. Parco");
			System.out.println("7. Mercato");
			System.out.println("0. Torna al menu precedente");

			scelta = In.inputInt();
			GamePanel.clearScreen();

			switch (scelta) {
			case 1:
				Tabacchino tabacchino = new Tabacchino();
				System.out.println("Tabacchno");
				tabacchino.runTabacchino();
				break;

			case 2:
				Bar bar = new Bar();
				System.out.println("Bar");
				bar.runBar();
				break;

			case 3:
				Cantiere cantiere = new Cantiere("Scavi archeologici");
				System.out.println("Cantiere");
				cantiere.runCantiere();
				break;

			case 4:
				
				PuntoSNAI pSnai = new PuntoSNAI();
				System.out.println("Punto SNAI");
				pSnai.runPSNAI();
				break;


            case 5:
                Parchetto parco = new Parchetto();
                System.out.println("Parco");
                parco.runParcchetto();
                break;

			case 6:

				break;

			case 7:
				Mercato mercato = new Mercato("Porta Portese");
				System.out.println("Mercato");
				mercato.runMercato();
				break;

			case 0:
				System.out.println("Stai uscendo...");
				break;

			default:
				System.out.println("Scelta errata");
				break;
			}

		} while (scelta != 0);

	}

	public void runMenu() {
	}
}
