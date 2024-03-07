package Stanze.Mercato.AzioniMercato;

import Main.GamePanel;

public class RandomDice {

    Double y;
    Double x ;
    Double karmaNorm ;

    public double normalizzaKarma(){

        //normalizza karma *2
        double karmaNorm = GamePanel.giocatore.getKarma() * 2;

        //inverti segno
        karmaNorm = karmaNorm * -1;

        return karmaNorm;

    }
    public int getDado(int minimo , int massimo){

        x = Input.Casuale.numeroCasuale();

        y =  (0.5 * x * (normalizzaKarma() * (x-1)+2));

        y = minimo + (y * massimo);

        int dado = y.intValue();

        return dado;
    }
}
