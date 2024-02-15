package Main;

import Stanze.Mercato.LogicaMercato.Bancarella;
import Stanze.Mercato.LogicaMercato.Market;
import Stanze.Mercato.Mercato;

public class Main {
	public static void main(String[] args) {


		Mercato pippo = new Mercato("porta portese");
		pippo.runMercato();
	}
}