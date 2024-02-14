package Main;

import Stanze.Mercato.OggettiMercanti.Bancarella;
import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.SubObjects.Carne;
import Stanze.Mercato.OggettiMercanti.SubObjects.Pesce;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
    OggettiMercanti pippo = new OggettiMercanti();
	pippo.stampaMappa();
		pippo.creaInventario(Pesce.pesciEsistenti);
		pippo.creaInventario(Carne.carniEsistenti);
		Bancarella.istanziaNBancarelle(pippo.getInventario());

}
}