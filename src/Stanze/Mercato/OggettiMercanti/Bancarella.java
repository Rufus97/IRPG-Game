package Stanze.Mercato.OggettiMercanti;

import Input.Casuale;

import java.util.*;

public class Bancarella {

    List<OggettiMercanti> inventarioBancarella = new ArrayList<>();

    private  static Set<TipoBancarella> flag = new HashSet<>();
    private static List<Bancarella> bancarelle = new ArrayList<>();

    public Bancarella(Map<TipoBancarella, List<OggettiMercanti>> mappa){
      selezioneCasuale(mappa);
    }

    public void selezioneCasuale(Map<TipoBancarella, List<OggettiMercanti>> mappa){
        int rng1 = Casuale.numeroCasualeTra(0, 1);
        List<OggettiMercanti> inventarioSelezione = mappa.get(TipoBancarella.values()[rng1]);
        flag.add(TipoBancarella.values()[rng1]);


        int rng3 = Casuale.numeroCasualeTra(1, inventarioSelezione.size());
        for (int i = 0; i < rng3; i++){
         int rng2 = Casuale.numeroCasualeTra(0, inventarioSelezione.size()-1);
         if (!this.inventarioBancarella.contains(inventarioSelezione.get(rng2))){
         this.inventarioBancarella.add(inventarioSelezione.get(rng2));
            }
        }



    }
    public static void istanziaNBancarelle(Map<TipoBancarella, List<OggettiMercanti>> mappa){
        int rng = Casuale.numeroCasualeTra(0, 1);
        Collection<TipoBancarella> flaggers = Arrays.asList(TipoBancarella.values());
        for (int i = 0; i < 10; i++){
                    bancarelle.add(new Bancarella(mappa));

        }
    }

    public static List<Bancarella> getBancarelle() {
        return bancarelle;
    }

    public static Set<TipoBancarella> getFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "Bancarella{" +
                "inventarioBancarella=" + inventarioBancarella +
                '}';
    }
}
