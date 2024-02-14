package Stanze.Mercato.OggettiMercanti.SubObjects;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Pesce extends OggettiMercanti {

    public static List<OggettiMercanti> pesciEsistenti = new ArrayList<>(
            Arrays.asList(
                    new Pesce("aringa",3, TipoBancarella.PESCE),
                    new Pesce("platessa",3, TipoBancarella.PESCE),
                    new Pesce("merluzzo",3, TipoBancarella.PESCE)
            )
    );

    public Pesce( String nome, double prezzoAlKg, TipoBancarella tipoOggetto){

        super.nome = nome;
        super.prezzoAlKg = prezzoAlKg;
        super.tipoOggetto = tipoOggetto;
    }

    @Override
    public String toString() {
        return
                "nome: " + nome + '\'' +
                " prezzoAlKg: " + prezzoAlKg
               ;
    }
}
