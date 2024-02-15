package Stanze.Mercato.LogicaMercato;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

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

    public void getAllAvaibleNames(List<Bancarella> myBancs){
        for (Bancarella element : myBancs){
            System.out.println(element.getNomeBancarella());
        }
    }
    public Bancarella getSpecificBanc(TipoBancarella tipo){
        Bancarella result = null;
        for (Bancarella element : this.getAvaibleBancarelle()){
            if (element.getProdottoVenduto().equals(tipo)){
                result = element;
            }
        }
        return result;
    }
}
