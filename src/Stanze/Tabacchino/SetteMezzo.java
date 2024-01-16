package Stanze.Tabacchino;

import Input.Casuale;

public class SetteMezzo {

    double cartaBanco1;
    double cartaBanco2;
    double cartaGiocatore1;
    double cartaGiocatore2;
    double cartaGiocatore3;

    Casuale numeroCasuale = new Casuale();

    public void giocaSetteMezzo(){
        double banco = carteBanco();
        double giocatore = carteGiocatore();

        if(giocatore > banco && giocatore <7.5){ System.out.println("hai vinto");}

    }


    public double carteBanco(){

        cartaBanco1 = cartaCasuale();
        cartaBanco2 = cartaCasuale();

        double sommaBanco = cartaBanco1 + cartaBanco2;
        System.out.println("Le Carte del banco " + cartaBanco1 + " " + cartaBanco2);

        return sommaBanco;
    }

    public double carteGiocatore(){

        cartaGiocatore1 = cartaCasuale();
        cartaGiocatore2 = cartaCasuale();
        cartaGiocatore3 = cartaCasuale();

        double sommaGiocatore = cartaGiocatore1 + cartaGiocatore2 + cartaGiocatore3;
        System.out.println("Le tue carte " + cartaGiocatore1 + " " + cartaGiocatore2 + " " + cartaGiocatore3 + " " );

        return sommaGiocatore;

    }

    public double cartaCasuale(){

        double carta = numeroCasuale.numeroCasualeTra(1, 10);
        if(carta >= 8){
            carta = 0.5;
        }
        return carta;
    }
}
