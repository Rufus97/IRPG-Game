package Stanze.Mercato.OggettiMercanti;

import Input.Casuale;

import java.util.*;

public class Bancarella {

    List<OggettiMercanti> inventarioBancarella = new ArrayList<>();
    private TipoBancarella prodottoVenduto;
    private boolean isAvaible;


    public Bancarella(TipoBancarella prodottoVenduto){

      int rng = Casuale.numeroCasualeTra(0,1);
      this.prodottoVenduto = prodottoVenduto;
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

    public List<OggettiMercanti> getInventarioBancarella() {
        return inventarioBancarella;
    }
    public boolean getIsAvaible(){
        return this.isAvaible;
    }
    @Override
    public String toString() {
        return " Bancarella: " + prodottoVenduto +
                " inventarioBancarella: " + inventarioBancarella +
                " isAvaible: " + isAvaible +
                '}';
    }
}
