package Stanze.Mercato.OggettiMercanti;

import Stanze.Mercato.OggettiMercanti.SubObjects.Pesce;

import java.util.*;

public enum TipoBancarella {
   PESCE ("pescheria") ,
   MACELLERIA ("macelleria") ,
    ORTOFRUTTA("ortofrutta"),
    VESTITI("vestiti "),
   BIGIOTTERIA("bigiotteria");

   private String nome;
   private TipoBancarella(String nome){
       this.nome = nome;
   }

    public String getNome() {
        return nome;
    }
}

