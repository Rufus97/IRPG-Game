package Stanze.bar.azioni;

import Input.Casuale;
import Main.GamePanel;
import Stanze.bar.Azione;

public class RubaDallaCassa extends Azione {
    public RubaDallaCassa(String nome, String descrizione) {
        super(nome, descrizione);
    }

    @Override
    public void run() {
        double soldiValue;

        if(super.rng.getDado(1,20) >= 6){

            int dado = super.rng.getDado(1,20);
            if(dado == 20){
                System.out.println("Hai fatto Jackpot");
                int soldi = super.rng.getDado(300,600);
                GamePanel.giocatore.setSoldi((double) soldi);
                System.out.println("Soldi +" + soldi);
            } else if (dado >= 15) {
                System.out.println("Daje oggi se magna!");
                int soldi = super.rng.getDado(100,300);
                GamePanel.giocatore.setSoldi((double) soldi);
                System.out.println("Soldi +" + soldi);
            } else {
                System.out.println("Poteva andà mejo");
                int soldi = super.rng.getDado(10,100);
                GamePanel.giocatore.setSoldi((double) soldi);
                System.out.println("Soldi +" + soldi);
            }

            GamePanel.giocatore.setLivelloSoddisfazione(0.06);
            System.out.println("Soddisfazione +" + 0.06);

        }

        GamePanel.giocatore.controlloSetKarma(- 0.06);
        System.out.println("karma -" + 0.06);
    }
}
