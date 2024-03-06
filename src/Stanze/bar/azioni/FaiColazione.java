package Stanze.bar.azioni;

import Main.GamePanel;
import Stanze.bar.Azione;
import prompt.Prompt;

public class FaiColazione extends Azione {
    public FaiColazione(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }
    @Override
    public void run(){


        if(GamePanel.giocatore.controllaSoldi(-2.5)) {
            GamePanel.giocatore.controlloSetHP(5);
            System.out.println("Hai inzuppato il cornetto nel cappuccino e stai subito meglio!");
        }
    }
}
