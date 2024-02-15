package Stanze.Mercato.OggettiMercanti.SubObjects;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VestitiUsati extends OggettiMercanti {

    public static List<OggettiMercanti> vestitiEsistenti = new ArrayList<>(
            Arrays.asList(
                    new VestitiUsati("pantalone", TipoBancarella.VESTITI, 20),
                    new VestitiUsati("guanto da barbone", TipoBancarella.VESTITI, 30),
                    new VestitiUsati("magliettina pecorina", TipoBancarella.VESTITI, 10)
            )
    );

    public VestitiUsati( String nome, TipoBancarella tipoOggetto, double prezzo){
        super.prezzo = prezzo;
        super.nome = nome;
        super.tipoOggetto = tipoOggetto;
    }

    @Override
    public String toString() {
        return "Vestiti { " +
                " nome: " + nome + '\'' +
                " prezzo: " + prezzo +
                "}"
                ;
    }
}
