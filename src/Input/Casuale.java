public class Casuale {
    double numeroCasuale;

    public Casuale(double numeroCasuale) {
        this.numeroCasuale = numeroCasuale;
    }

    double numeroCasuale(){
        numeroCasuale = Math.random();
        return numeroCasuale;
    }

    int numeroCasualeInt(){

        numeroCasuale = Math.random();
        return (int) (numeroCasuale * 100);

    }

    int numeroCasualeTra(int min, int max){

        numeroCasuale = Math.random();
        return (int)((numeroCasuale * (max-min)+1) + min);

    }


}
