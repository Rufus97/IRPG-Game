package Main;


import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Logic.Market;
import Stanze.Mercato.Mercato;

import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Mercato pippo = new Mercato("jac");
		pippo.runMercato();
	}
}