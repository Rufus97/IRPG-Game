package Main;

import Stanze.Mercato.LogicaMercato.Bancarella;
import Stanze.Mercato.LogicaMercato.Market;

public class Main {
	public static void main(String[] args) {


		Market pippo = new Market();
		for (Bancarella element : pippo.getBancarelle()){
			System.out.println(element);
		}
		System.out.println("---------------");
		for (Bancarella element : pippo.getAvaibleBancarelle()){
			System.out.println(element);
		}
	}
}