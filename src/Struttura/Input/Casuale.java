package Struttura.Input;

public class Casuale {
    double numeroCasuale;

    public Casuale() {
    }

    public double numeroCasuale(){
        numeroCasuale = Math.random();
        return numeroCasuale;
    }

    public int numeroCasualeInt(){

        numeroCasuale = Math.random();
        return (int) (numeroCasuale * 100);

    }

    public int numeroCasualeTra(int min, int max){

        numeroCasuale = Math.random();
        return (int)((numeroCasuale * (max-min)+1) + min);

    }


}
