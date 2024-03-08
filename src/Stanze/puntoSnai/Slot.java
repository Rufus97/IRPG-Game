package Stanze.puntoSnai;

import Input.Casuale;
import Main.GamePanel;

public class Slot {

	private static final int RIGHE = 5;
	private static final int COLONNE = 5;
	private static final String[] SIMBOLI = { "\uD83C\uDF52", "\uD83C\uDF4A", "\uD83C\uDF4B", "\uD83C\uDF51",
			"\uD83D\uDD14", "\uD83C\uDF6C", "\uD83C\uDF81", "\uD83D\uDC8E", "\uD83D\uDFB0", "\uD83D\uDC9D" };

	private static final int[] VINCITE = { 1, 2, 3, 4, 5, 7, 10, 15, 20, 50 };

	public static void runSlot() {
		System.out.println("I tuoi soldi " + GamePanel.giocatore.getSoldi());
		System.out.println("Da quanto la giocata? min 1 max 4 euro");

		double costoPartita = (Input.In.scanner.nextInt() * -1);

		if (GamePanel.giocatore.controllaSoldi(costoPartita)) {
			System.out.println(GamePanel.giocatore.getSoldi());
			GamePanel.clearScreen();
			int[][] risultato = spin();
			stampaRisultato(risultato);
			double vincita = vincitaTotale(risultato);
			System.out.println("Vincita totale: " + vincita);
			GamePanel.giocatore.controllaSoldi(vincita);
		} else {
			System.out.println("Non è stato possibile effettuare la giocata");
		}
	}

	public static int[][] spin() {
		int[][] risultato = new int[RIGHE][COLONNE];

		// Calcola il karma del giocatore
		double karma = GamePanel.giocatore.getKarma();

		// Calcola la probabilità di vincita basata sul karma del giocatore
		double casuale = Casuale.numeroCasuale() + (karma / 10);
		int premio = 0; // Inizializza il premio a 0

		if (casuale > 0.7) {
			// Imposta il premio in base alla probabilità di vincita
			if (casuale >= 0.9999999) {
				premio = 9; // Simbolo corrispondente al premio più alto
			} else if (casuale >= 0.999995) {
				premio = 8;
			} else if (casuale >= 0.999) {
				premio = 7;
			} else if (casuale >= 0.99) {
				premio = 6;
			} else if (casuale >= 0.98) {
				premio = 5;
			} else if (casuale >= 0.97) {
				premio = 4;
			} else if (casuale >= 0.95) {
				premio = 3;
			} else if (casuale >= 0.85) {
				premio = 2;
			} else {
				premio = 1; // Simbolo corrispondente al premio più basso
			}
		}

		// Genera le righe delle slot
		for (int i = 0; i < RIGHE; i++) {
			if (i == 0 && premio != 0) { // Se questa è la prima riga e c'è un premio
				// Genera una riga vincente con il premio calcolato
				for (int j = 0; j < COLONNE; j++) {
					risultato[i][j] = premio - 1; // Simbolo corrispondente al premio
				}
			} else {
				// Genera una riga casuale
				for (int j = 0; j < COLONNE; j++) {
					risultato[i][j] = Casuale.numeroCasualeTra(0, SIMBOLI.length - 1);
				}
			}
		}

		return risultato;
	}

	public static int vincitaTotale(int[][] risultato) {
		int vincita = 0;

		// Controllo delle combinazioni sulle righe
		for (int i = 0; i < RIGHE; i++) {
			if (risultato[i][0] == risultato[i][1] && risultato[i][1] == risultato[i][2]
					&& risultato[i][2] == risultato[i][3] && risultato[i][3] == risultato[i][4])

			{
				vincita += VINCITE[risultato[i][0]]; // Aggiungi la vincita corrispondente al simbolo
				System.out.println("Vincita trovata nella riga " + (i + 1) + ": " + vincita);
			}
		}

		// Controllo delle combinazioni sulle colonne
		for (int j = 0; j < COLONNE; j++) {
			if (risultato[0][j] == risultato[1][j] && risultato[1][j] == risultato[2][j]
					&& risultato[2][j] == risultato[3][j] && risultato[3][j] == risultato[4][j])

			{
				vincita += VINCITE[risultato[0][j]]; // Aggiungi la vincita corrispondente al simbolo
				System.out.println("Vincita trovata nella colonna " + (j + 1) + ": " + vincita);
			}
		}

		if (vincita == 0) {
			System.out.println("Nessuna vincita trovata.");
		}

		return vincita;
	}

	public static void stampaRisultato(int[][] risultato) {
		for (int i = 0; i < RIGHE; i++) {
			for (int j = 0; j < COLONNE; j++) {
				System.out.print(SIMBOLI[risultato[i][j]] + " ");
			}
			System.out.println();
		}
	}
}