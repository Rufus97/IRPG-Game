package Stanze.Mercato.LogicaMercato;

import Input.Casuale;
import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.*;

public class Bancarella {

    List<OggettiMercanti> inventarioBancarella = new ArrayList<>();
    private TipoBancarella prodottoVenduto;
    private boolean isAvaible;

    private String nomeBancarella;


    public Bancarella(TipoBancarella prodottoVenduto){

      int rng = Casuale.numeroCasualeTra(0,1);
      this.prodottoVenduto = prodottoVenduto;
      this.nomeBancarella = prodottoVenduto.getNome();
      if (rng == 1){
      this.isAvaible = true;
      } else {
          isAvaible = false;
      }
    }
    

    public static List<Bancarella> selezioneCasuale(Map<TipoBancarella, List<OggettiMercanti>> mappa){
        List<Bancarella> bancarelle = new ArrayList<>();

        for (int tipo = 0; tipo < TipoBancarella.values().length; tipo ++){
            Bancarella newBanc =  new Bancarella(TipoBancarella.values()[tipo]);
            List<OggettiMercanti> inventarioSelezione = mappa.get(TipoBancarella.values()[tipo]);

            int rng2 = Casuale.numeroCasualeTra(0, inventarioSelezione.size()-1);
                 for (int i = 0; i <= rng2; i++){
                 int rng3 = Casuale.numeroCasualeTra(0, inventarioSelezione.size()-1);
                 if (!newBanc.inventarioBancarella.contains(inventarioSelezione.get(rng3))){
                     newBanc.inventarioBancarella.add(inventarioSelezione.get(rng3));

                 }
            }
            bancarelle.add(newBanc);
        }
        return bancarelle;
    }

    public String getNomeBancarella() {
        return nomeBancarella;
    }

    public List<OggettiMercanti> getInventarioBancarella() {
        return inventarioBancarella;
    }
    public boolean getIsAvaible(){
        return this.isAvaible;
    }
    @Override
    public String toString() {
        return " Bancarella: " + nomeBancarella +
                " inventarioBancarella: " + inventarioBancarella +
                " isAvaible: " + isAvaible +
                '}';
    }
}
