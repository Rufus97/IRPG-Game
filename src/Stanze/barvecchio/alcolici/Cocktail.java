package Stanze.barvecchio.alcolici;

import Input.In;


import java.util.ArrayList;
import java.util.List;

public class Cocktail {
    private double tassoAlcolico;
    private int capienzaMassima = 200;
    List<TipoAlcolico> alcolici = new ArrayList<>();
    public Cocktail() {

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
