package Stanze.bar.azioni.Mangia;

import Input.Casuale;
import Stanze.bar.Azione;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mangia extends Azione {

    List<Cibo> cibi = new ArrayList<>(Arrays.asList(Cibo.values()));
    public Mangia(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }

    @Override
    public void run() {
        List<Cibo> risultati = new ArrayList<>();
        Integer rng = Casuale.numeroCasualeTra(0,Cibo.values().length-1);
        for(int i = 0; i <= rng; i++){
            Integer rng2 = Casuale.numeroCasualeTra(0, Cibo.values().length-1);
            if(!risultati.contains(Cibo.values()[rng2])){
                risultati.add(Cibo.values()[rng2]);
            }
        }
        System.out.println(risultati);
        //TODO - se karma basso probabilità che ti viene il cagotto
    }
}
