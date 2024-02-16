package Stanze.Mercato.OggettiMercanti;

import Stanze.Mercato.OggettiMercanti.SubObjects.Pesce;

import java.util.*;

public enum TipoBancarella {
   PESCE ("pescheria 1") ,
   MACELLERIA ("macelleria 3") ,
    ORTOFRUTTA("ortofrutta 2"),
    VESTITI("vestiti 5"),
   BIGIOTTERIA("bigiotteria 4");

   private String nome;
   private TipoBancarella(String nome){
       this.nome = nome;
   }

    public String getNome() {
        return nome;
    }
}

