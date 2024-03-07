package Stanze.bar.azioni.cocktail;

import Input.In;
import Stanze.bar.Azione;


import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Azione {
    private double tassoAlcolico;
    private int capienzaMassima = 200;
    List<TipoAlcolico> alcolici = new ArrayList<>();
    public Cocktail(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }

    public void run() {

        int counter = 3;
        int scelta;
        double sommaTassoAlcolemico = 0;

        for (TipoAlcolico element : TipoAlcolico.values()){
            alcolici.add(element);
        }
        System.out.println(alcolici);
        for(int i = 0; i < counter; i++){
            scelta = In.inputInt();
            sommaTassoAlcolemico = this.tassoAlcolico += alcolici.get(scelta).getGradazioneAlcolica();
            System.out.println(scelta);
        }
        double percentualeTassoAlcolemico = (sommaTassoAlcolemico / (counter * 100)) * capienzaMassima;

    }
    @Override
    public String toString() {
        return "Cocktail{" +
                "tassoAlcolico=" + tassoAlcolico +
                ", capienzaMassima=" + capienzaMassima +
                ", alcolici=" + alcolici +
                '}';
    }
}
