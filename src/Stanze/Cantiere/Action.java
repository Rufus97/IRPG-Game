package Stanze.Cantiere;

import java.util.HashMap;
import java.util.Map;
import Input.In;
import Main.GamePanel;

public class Action {

    Map<Integer, Commenti> commentiMap = new HashMap<>();

    int scelta;
    int operaio = 0;
    int danno = 0;
    public void commentaLavori(){

        commentiMap.put(1, new Commenti("Sempre a rompe state","Vecio non ropme non stamo a giocà "));
        commentiMap.put(2, new Commenti("A che ora staccate?", "Alle 17, vatte a fa un giro mo"));
        commentiMap.put(3, new Commenti("Giovane cosi te fai male, non si usa cosi la pala", "Ma un cricomassimo de cazzi tua no?"));
        commentiMap.put(4, new Commenti("Tappate bene eh, che l ultima volta uno con la moto è caduto", "Speriamo che il prossimo sei tu vecio"));
        
        do{
            stampaMenu();

            scelta = In.scanner.nextInt();
            if(scelta !=0){

            if(! commentiMap.get(scelta).giaScelto){

            commentiMap.get(scelta).giaScelto = true ;
            GamePanel.clearScreen();

            }
            GamePanel.clearScreen();
            stampaRisposte(scelta);
           scelta = operaioRage(scelta);
        }
        
        }while(scelta != 0 );
    }


    public void stampaMenu(){
        
        System.out.println();
        for (Integer integer : commentiMap.keySet()) {

            if (!commentiMap.get(integer).giaScelto) {
        
                System.out.println( integer + " "+ commentiMap.get(integer).frase);
            }
        }
        System.out.println( "0 non dar fastidio e vattene");
    }

    public void stampaRisposte(int scelta){

        System.out.println("Operaio:");
        System.out.println(commentiMap.get(scelta).risposta );
    }

    public int operaioRage(int scelta){

        operaio ++;
        if(operaio >= 3 || (operaio >= 3 && scelta ==3)){
            
            GamePanel.clearScreen();
            danno = Input.Casuale.numeroCasualeTra(10, 25);
            System.out.println("Gli oerai non ti sopportano piu; Uno di loro ti ricorda che quella pala la sa usare bene ");
            System.out.println("Ti prendi una palata in mezzo ai denti, subisci " + danno + " danni");

            GamePanel.giocatore.setHP( danno *-1);
            GamePanel.giocatore.mostraStatistiche();
            scelta = 0;
        }
        
        return scelta;

    }
}