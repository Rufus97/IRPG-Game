package Stanze.Mercato.OggettiMercanti;

import java.util.*;

import Input.Casuale;
import Input.Casuale.*;
import Stanze.Mercato.OggettiMercanti.SubObjects.*;

public class   OggettiMercanti {

    protected String nome;
    protected double prezzo;
    protected double prezzoAlKg;
    protected TipoBancarella tipoOggetto;

    private Map<TipoBancarella, List<OggettiMercanti>> inventario = new HashMap<>();


    public void  creaInventario(List<OggettiMercanti> lista){

        inventario.put(lista.get(0).tipoOggetto, lista);
    }

    public void stampaMappa(){
        for(Map.Entry<TipoBancarella, List<OggettiMercanti>> entry : inventario.entrySet()){
            System.out.println(entry);
        }
    }
    public Map<TipoBancarella, List<OggettiMercanti>> getInventario() {
        return inventario;
    }

    public TipoBancarella getTipoOggetto() {
        return tipoOggetto;
    }

    public static OggettiMercanti initializeMarket(){
        OggettiMercanti mercato = new OggettiMercanti();
        mercato.creaInventario(Pesce.pesciEsistenti);
        mercato.creaInventario(Carne.carniEsistenti);
        mercato.creaInventario(VestitiUsati.vestitiEsistenti);
        mercato.creaInventario(Bigiotteria.bigiottiEsistenti);
        mercato.creaInventario(Ortofrutta.verdureEsistenti);
        return mercato;
    }

    public String getNome() {
        return nome;
    }


    public double getPrezzo() {
        return prezzo;
    }

    public double getPrezzoAlKg() {
        return prezzoAlKg;
    }

    @Override
    public String toString() {
        return "OggettiMercanti{" +
                "nome='" + nome + '\'' +
                ", tipoOggetto=" + tipoOggetto +
                '}';
    }
}
