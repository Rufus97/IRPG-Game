import java.util.Arrays;


public class Tabacchino {

    Integer[] novantaNum = new Integer[90]; 
    int[] numeriGiocatore = new int[10];
    int[] numeriEstratti = new int[20];
    int numeriPresi = 0;

    //costruttore
    public Tabacchino() {
    }
    
    //istanza di casuale
    Casuale numeroCasuale = new Casuale(0);

    //10 e lotto
    public void gioca10eLotto(){

        //carica 90 numeri nell array
        for(int i = 0 ; i < 90; i++ ){

            novantaNum[i] = i+1;
        }

        System.out.println("Ao i nummeri te metto io o je metti a cazzo?");

        //numeri giocatore generati casualmente
        for(int i = 0; i < 10 ; i++){

            int estratto = (int)numeroCasuale.numeroCasualeTra(1,90);

            if(novantaNum[estratto-1] != null){

                novantaNum[estratto-1] = null;
                numeriGiocatore[i] = estratto;
            }else{i--;
                    }
        }
        System.out.println("I numeri sfortunati del giocatore " + Arrays.toString(numeriGiocatore));
        //fine
        
        //numeri dell estrazione
        for(int i = 0; i < 20 ; i++){

            int estratto = (int)numeroCasuale.numeroCasualeTra(1,90);

            if(novantaNum[estratto-1] != null){

                novantaNum[estratto-1] = null;
                numeriEstratti[i] = estratto;
            }else{i--;
                    }
        }
        System.out.println("I numeri estratti sono            " + Arrays.toString(numeriEstratti));

        //controlla vincita
        for (int i : numeriGiocatore){

            for (int j : numeriEstratti){

                if( i == j){
                    numeriPresi++ ;
                }
            }
        }

        System.out.println("daje zi hai preso " + numeriPresi + " numeri" );
    }

}
