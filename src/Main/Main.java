package Main;


import Stanze.puntoSnai.Cavalli.Cavallo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Cavallo spirit = new Cavallo("spirit");
		Cavallo spirit2 = new Cavallo("spirit2");
		Cavallo spirit3 = new Cavallo("spirit3");

		List<String> winners = new ArrayList<>();
		System.out.println(spirit.getPercorso().size());

		System.out.println(spirit.getPercorso().indexOf("🏇"));

		List<Cavallo> bibi = new ArrayList<>(Arrays.asList(spirit, spirit2, spirit3));
		for (int i = 0; i <  10; i++){
			for (Cavallo element : bibi){

				System.out.println("----" + element.getNome());
				System.out.println(element.getIndexOfHorse());
				element.movimentoCavallo();
				System.out.println(element.getIndexOfHorse());
				if (element.getIndexOfHorse() == 9){
					winners.add(element.getNome());
					System.out.println(element.getNome() + " è arrivato per primo!!!");
				}


			}
			System.out.println(winners);
		}

	}
}