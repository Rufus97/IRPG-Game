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

        if(GamePanel.giocatore.getKarma() != -1){

            if(GamePanel.giocatore.getKarma() >= 0 && GamePanel.giocatore.getKarma() <= 1){
                GamePanel.giocatore.setSoldi(soldiValue = Casuale.numeroCasualeTraDouble(20.0,100.0));

            }else {GamePanel.giocatore.setSoldi(soldiValue = Casuale.numeroCasualeTraDouble(0.0,20.0));}
            System.out.println("Daje! oggi se magna!");
            System.out.println("Soldi +" + Math.round(soldiValue * 100.0) / 100.0 + "\n");

            GamePanel.giocatore.setLivelloSoddisfazione(0.06);
            System.out.println("Soddisfazione +" + 0.06);

        } else {System.out.println("Te dice male! Non c'è 'na lira in cassa");}

        GamePanel.giocatore.controlloSetKarma(0.06);
        System.out.println("karma -" + 0.06);
    }
}
