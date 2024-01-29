package Stanze.Tabacchino;
import java.util.Arrays;
import Input.Casuale;
import Input.In;
import Main.GamePanel;               


public class DiecieLotto {

    int[] numeriGiocatore = new int[10];
    int[] numeriEstratti = new int[20];
    int numeriPresi = 0;
    double costoPartita;

    //costruttore
    public DiecieLotto() {
    }
    
    //istanza di casuale
    int scelta;
    public void gioca10eLotto(){

        System.out.println("I tuoi soldi " + GamePanel.giocatore.getSoldi());
        System.out.println("Da quanto la giocata? min 1 max 200 euro");
      
        costoPartita = (In.scanner.nextInt()*-1);


        if (GamePanel.giocatore.controllaSoldi(costoPartita)  == true){
            System.out.println( GamePanel.giocatore.getSoldi());

            GamePanel.clearScreen();

            numeriGiocatoreRandom(numeriGiocatore);
            
            numeriEstrazione(numeriEstratti);
           
            controlloVincita();

            }else{
            System.out.println("Non è stato possibile affettuare la giocata");

        }
    }
    public void numeriEstrazione(int numeriEstratti[]){

        int numeroEstratto; Casuale.numeroCasualeTra(1,90);
        int n = 0;
        boolean giaEstratto = false;

        for(int j = 0; j < numeriEstratti.length; j++){

           numeroEstratto = Casuale.numeroCasualeTra(1,90);
           giaEstratto = false;
           
           for(int i = 0; i < n ; i++){

                if(numeroEstratto == numeriEstratti[i]){
                    giaEstratto = true;
                }
            }
            if(giaEstratto){
                j--;
            }else{
                numeriEstratti[j] = numeroEstratto;
                n++;
            }
        }
        System.out.println("Inumeri estratti sono \n" + Arrays.toString(numeriEstratti));
        
    }

    public void numeriGiocatoreRandom(int numeriGiocatore[]){

        int numeroEstratto; Casuale.numeroCasualeTra(1,90);
        int n = 0;
        boolean giaEstratto = false;

        for(int j = 0; j < numeriGiocatore.length; j++){

           numeroEstratto = Casuale.numeroCasualeTra(1,90);
           giaEstratto = false;
           
           for(int i = 0; i < n ; i++){

                if(numeroEstratto == numeriGiocatore[i]){
                    giaEstratto = true;
                }
            }
            if(giaEstratto){
                j--;
            }else{
                numeriGiocatore[j] = numeroEstratto;
                n++;
            }
        }

        System.out.println("I tuoi numero sono: \n" + Arrays.toString(numeriGiocatore));
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
