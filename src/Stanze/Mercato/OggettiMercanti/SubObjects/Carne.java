package Stanze.Mercato.OggettiMercanti.SubObjects;

import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Carne extends OggettiMercanti {
    public static List<OggettiMercanti> carniEsistenti = new ArrayList<>(
            Arrays.asList(
                    new Carne("manzo",3, TipoBancarella.MACELLERIA),
                    new Carne("pollo",3, TipoBancarella.MACELLERIA),
                    new Carne("maiale",3, TipoBancarella.MACELLERIA)
            )
    );

    public Carne( String nome, double prezzoAlKg, TipoBancarella tipoOggetto){

        super.nome = nome;
        super.prezzoAlKg = prezzoAlKg;
        super.tipoOggetto = tipoOggetto;
    }
    @Override
    public String toString() {
        return "Carne {" +
                " nome: " + nome + '\'' +
                " prezzoAlKg: " + prezzoAlKg +
                "}"
                ;
    }
}
