package Input;

import java.util.Map;
import java.util.Scanner;

/* Classe dedicata unicamente agli input degli utenti.
Si richiama così In. */
public class In {
	public static Scanner scanner = new Scanner(System.in);

	public static int inputInt() {
		Boolean check = false;
		int sc = 0;

		do {
			check = false;
			String s = scanner.nextLine();

			try {
				sc = Integer.valueOf(s);
			} catch (Exception e) {
				check = true;
				if (!"".equals(s)) {
					System.out.println("input non valido");
				}
			}

		} while (check);
		return sc;
	}

	public static int inputForMaps(Map mappa){
		int x;
		boolean check;
		do {
			check = true;
			x = inputInt();
			if (!(x <= mappa.size() && x >= 0)) {
				check = false;
				System.out.println("input errato");
			}

		} while (!check);
		return x;
	}

}
