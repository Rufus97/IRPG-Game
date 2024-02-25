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

		List<Cavallo> bibi = new ArrayList<>(Arrays.asList(spirit, spirit2, spirit3));
		for (int i = 0; i < 3; i++){
			for (Cavallo element : bibi){
				System.out.println("----" + element.getNome());
				element.movimentoCavallo();
			}
		}
	}
}