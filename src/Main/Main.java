package Main;


import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;
import Stanze.Mercato.Bancarella.MarketObjects;
import Stanze.Mercato.Bancarella.SpecificBanc.Pesce;

import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
	  Bancarella pippo = new Bancarella();
	  pippo.fillMap();
	  System.out.println(pippo.getMapOfBancs());
	}
}