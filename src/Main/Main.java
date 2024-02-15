package Main;

import Stanze.Mercato.OggettiMercanti.Bancarella;
import Stanze.Mercato.OggettiMercanti.Market;
import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.SubObjects.*;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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