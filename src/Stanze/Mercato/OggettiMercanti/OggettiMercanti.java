package Stanze.Mercato.OggettiMercanti;

import java.util.*;

import Input.Casuale;
import Input.Casuale.*;

public class OggettiMercanti {

    protected String nome;
    protected double prezzo;
    protected double prezzoAlKg;
    protected double quantitàKg;
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

    @Override
    public String toString() {
        return "OggettiMercanti{" +
                "nome='" + nome + '\'' +
                ", tipoOggetto=" + tipoOggetto +
                '}';
    }
}
