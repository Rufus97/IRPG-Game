package Stanze.Tabacchino;

import java.util.Arrays;

import Input.Casuale;
import Main.GamePanel;               //IMPORTA QUESTO SE VUOI METTERE MAIN AL GIOCATORE
import Player.Personaggio;        //IMPORTA QUESTO SE VUOI METTERE MAIN AL GIOCATORE


public class DiecieLotto {


    Integer[] novantaNum = new Integer[90];
    int[] numeriGiocatore = new int[10];
    int[] numeriEstratti = new int[20];
    int numeriPresi = 0;

    //costruttore
    public DiecieLotto() {

    }
    
    //istanza di casuale
    Casuale numeroCasuale = new Casuale();
    int scelta;
    public void gioca10eLotto(){

        GamePanel.giocatore.getSoldi();
        numeriGiocatoreRandom();

        numeriEstrazione();

        controlloVincita();

    }

    public void numeriEstrazione(){

        setArray90();

        for(int i = 0; i < 20 ; i++){

            int estratto = (int)numeroCasuale.numeroCasualeTra(1,90);

            if(novantaNum[estratto-1] != null){

                novantaNum[estratto-1] = null;
                numeriEstratti[i] = estratto;
            }else{i--;
            }
        }
        System.out.println("I numeri estratti sono      " + Arrays.toString(numeriEstratti));
    }

    public void numeriGiocatoreRandom(){

        setArray90();
        for(int i = 0; i < 10 ; i++){

            int estratto = (int)numeroCasuale.numeroCasualeTra(1,90);

            if(novantaNum[estratto-1] != null){

                novantaNum[estratto-1] = null;
                numeriGiocatore[i] = estratto;
            }else{i--;
            }
        }
        System.out.println("I numeri del giocatore sono " + Arrays.toString(numeriGiocatore));
    }

    public void setArray90(){
        for(int i = 0 ; i < 90; i++ ){
            novantaNum[i] = i+1;
        }
    }

    public void controlloVincita(){

        numeriPresi = 0;
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
