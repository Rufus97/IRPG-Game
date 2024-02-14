package Stanze.Mercato.OggettiMercanti;

import Input.Casuale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bancarella {

    List<OggettiMercanti> inventarioBancarella = new ArrayList<>();

    public Bancarella(Map<TipoBancarella, List<OggettiMercanti>> mappa){
      selezioneCasuale(mappa);
    }

    public void selezioneCasuale(Map<TipoBancarella, List<OggettiMercanti>> mappa){
        int rng1 = Casuale.numeroCasualeTra(0, 1);
        List<OggettiMercanti> inventarioSelezione = mappa.get(TipoBancarella.values()[rng1]);

        int rng3 = Casuale.numeroCasualeTra(1, inventarioSelezione.size());
        for (int i = 0; i < rng3; i++){
         int rng2 = Casuale.numeroCasualeTra(0, inventarioSelezione.size()-1);
         if (!this.inventarioBancarella.contains(inventarioSelezione.get(rng2))){
         this.inventarioBancarella.add(inventarioSelezione.get(rng2));
         }
        }

    }

    @Override
    public String toString() {
        return "Bancarella{" +
                "inventarioBancarella=" + inventarioBancarella +
                '}';
    }
}
