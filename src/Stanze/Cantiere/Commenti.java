package Stanze.Cantiere;

public class Commenti {

    public boolean giaScelto = false;
    public String frase;
    public String risposta;

    public Commenti(String frase , String risposta) {
        this.frase = frase;
        this.risposta = risposta;
    }

  
    @Override
    public String toString() {
        return frase;
    }
   
}
