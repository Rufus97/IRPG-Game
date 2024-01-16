package Stanze.Tabacchino;

import java.util.Arrays;

import Input.Casuale;
import Input.In;
import Main.GamePanel;               


public class DiecieLotto {

    Integer[] novantaNum = new Integer[90];
    int[] numeriGiocatore = new int[10];
    int[] numeriEstratti = new int[20];
    int numeriPresi = 0;
    int costoPartita;

    //costruttore
    public DiecieLotto() {

    }
    
    //istanza di casuale
    Casuale numeroCasuale = new Casuale();
    int scelta;
    public void gioca10eLotto(){

        System.out.println("I tuoi soldi " + GamePanel.giocatore.getSoldi());
        System.out.println("Da quanto la giocata? min 1 max 200 euro");
      
        costoPartita = In.scanner.nextInt();


        if (GamePanel.giocatore.controllaSoldi( costoPartita) == true && costoPartita >= 1 && costoPartita <= 200){
            GamePanel.giocatore.setSoldi((costoPartita*-1));
            System.out.println( GamePanel.giocatore.getSoldi());

            numeriGiocatoreRandom();

            numeriEstrazione();

            controlloVincita();

            }else{
            System.out.println("Non è stato possibile affettuare la giocata");

        }
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
        System.out.println("Hai preso " + numeriPresi + " numeri");
        switch (numeriPresi) {
            case 0:
                    System.out.println("Hai vinto " + (costoPartita*2) + "euro");
                    GamePanel.giocatore.setSoldi((costoPartita*2));
                break;

                case 5:
                System.out.println("Hai vinto " + (costoPartita*5) + "euro");
                GamePanel.giocatore.setSoldi((costoPartita*5));
                break;

                case 6:
                System.out.println("Hai vinto " + (costoPartita*15) + "euro");
                GamePanel.giocatore.setSoldi((costoPartita*15));
                break;

                case 7:
                System.out.println("Hai vinto " + (costoPartita*150) + "euro");
                GamePanel.giocatore.setSoldi((costoPartita*150));
                break;

                case 8:
                System.out.println("Hai vinto " + (costoPartita*1000) + "euro");
                GamePanel.giocatore.setSoldi((costoPartita*1000));
                break;

                case 9:
                System.out.println("Hai vinto " + (costoPartita*20000) + "euro");
                GamePanel.giocatore.setSoldi((costoPartita*20000));
                break;
        
                case 10:
                System.out.println("Hai vinto " + (costoPartita*1000000) + "euro");
                GamePanel.giocatore.setSoldi((costoPartita*1000000));
                break;

                default:
                System.out.println("Con " + numeriPresi + " non vinci, ritenta sarai piu fortunato" );
                break;
        }
    }
}
