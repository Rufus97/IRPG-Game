package Stanze.Mercato.OggettiMercanti.SubObjects;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigiotteria extends OggettiMercanti{
    public static List<OggettiMercanti> bigiottiEsistenti = new ArrayList<>(
            Arrays.asList(
                    new Bigiotteria("collana", TipoBancarella.BIGIOTTERIA, 20),
                    new Bigiotteria("cazzatina", TipoBancarella.BIGIOTTERIA, 30),
                    new Bigiotteria("anello", TipoBancarella.BIGIOTTERIA, 10)
            )
    );

    public Bigiotteria( String nome, TipoBancarella tipoOggetto, double prezzo){
        super.prezzo = prezzo;
        super.nome = nome;
        super.tipoOggetto = tipoOggetto;
    }

    @Override
    public String toString() {
        return "Bigiotteria { " +
                " nome: " + nome + '\'' +
                " prezzo: " + prezzo +
                "}"
                ;
    }
}
