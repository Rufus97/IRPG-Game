package Main;


import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Logic.Market;

import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Market pippo = new Market();
		for (Map.Entry<Integer, List<BancItem>> element : pippo.getMapOfBancs().entrySet()){
			System.out.println(element.getValue());
		}
	}
}