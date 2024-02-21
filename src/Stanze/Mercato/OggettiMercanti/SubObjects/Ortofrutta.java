package Stanze.Mercato.OggettiMercanti.SubObjects;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ortofrutta extends OggettiMercanti{
    public static List<OggettiMercanti> verdureEsistenti = new ArrayList<>(
            Arrays.asList(
                    new Ortofrutta("zucchine",3, TipoBancarella.ORTOFRUTTA),
                    new Ortofrutta("melanzane",3, TipoBancarella.ORTOFRUTTA),
                    new Ortofrutta("peperoni",3, TipoBancarella.ORTOFRUTTA)
            )
    );

    public Ortofrutta( String nome, double prezzoAlKg, TipoBancarella tipoOggetto){

        super.nome = nome;
        super.prezzoAlKg = prezzoAlKg;
        super.tipoOggetto = tipoOggetto;
    }

    @Override
    public String toString() {
        return "Ortofrutta {" +
                " nome: " + nome + '\'' +
                " prezzoAlKg: " + prezzoAlKg +
                "}"
                ;
    }
}
