package Stanze.Mercato.LogicaMercato;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;

import java.util.ArrayList;
import java.util.List;

public class Market {
private List<Bancarella> bancarelle = new ArrayList<>();

    public Market(){
    this.bancarelle = Bancarella.selezioneCasuale(OggettiMercanti.initializeMarket().getInventario());
    }

    public List<Bancarella> getBancarelle() {
        return bancarelle;
    }
    public List<Bancarella> getAvaibleBancarelle() {
        List<Bancarella> avaibleBancs = new ArrayList<>();
        for (Bancarella element : this.bancarelle){
            if (element.getIsAvaible()){
                avaibleBancs.add(element);
            }
        }
        return avaibleBancs;
    }
}
