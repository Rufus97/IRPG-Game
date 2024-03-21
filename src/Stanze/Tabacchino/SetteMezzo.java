package Stanze.Tabacchino;

import Input.Casuale;
import Main.GamePanel;

public class SetteMezzo implements Itabacchino{

    public void run(){

        double totaleBanco;
        double totaleGiocatore;
        double cartaBanco1;
        double cartaBanco2;
        double cartaGiocatore1;
        double cartaGiocatore2 =0;
        double cartaGiocatore3=0;

        GamePanel.giocatore.setSoldi(-1d);
        if(vincita()){

            totaleGiocatore = Casuale.numeroCasualeTra(3, 7) + meta();
            totaleBanco = Casuale.numeroCasualeTra(2, ((int) totaleGiocatore)-1) + meta();

        }else{

            totaleBanco = Casuale.numeroCasualeTra(3, 7) + meta();
            totaleGiocatore = Casuale.numeroCasualeTra(2, ((int) totaleBanco)-1) + meta() + 0.5;
        }


        System.out.println("\n tot banco "+ totaleBanco + " \n tot giocatore " + totaleGiocatore);

        //carte banco
        if(totaleBanco - ((int)totaleBanco)>0){

            cartaBanco1 = (int)totaleBanco;
            cartaBanco2 = Casuale.numeroCasualeTra(8, 10);
        }else{
            cartaBanco1 = (Casuale.numeroCasualeTra(2,((int) totaleBanco)) -1);
            cartaBanco2 = totaleBanco - cartaBanco1;
        }

        //carte Giocatore
        if(totaleGiocatore -( (int) totaleGiocatore) > 0){
      
        cartaGiocatore1 = (Casuale.numeroCasualeTra(1, (int) totaleGiocatore-1));
        cartaGiocatore2 = (int)(totaleGiocatore - cartaGiocatore1);
        cartaGiocatore3 = Casuale.numeroCasualeTra(8,10);

        }else{
            
            cartaGiocatore1 = Casuale.numeroCasualeTra(1, (int) totaleGiocatore-2);
            cartaGiocatore2 = Casuale.numeroCasualeTra(1, ((int) (totaleGiocatore - cartaGiocatore1))-1);
            cartaGiocatore3 = totaleGiocatore - (cartaGiocatore1 + cartaGiocatore2);
        }

        System.out.println("Le carte del banco sono: " +  cartaBanco1 +" " + cartaBanco2);
        System.out.println("Le tue carte sono: " +  cartaGiocatore1 + " " + cartaGiocatore2 + " " + cartaGiocatore3 + "\n");


    }    

    public static double meta(){

        if (Casuale.numeroCasuale() >0.5) {

            return 0.5;
            
        }else{
            return 0d;
        }
    }

    public static boolean vincita(){
        
        double casuale = Casuale.numeroCasuale();
        int premio;
        if(casuale > 0.7 ){


            if(casuale >= 0.9999999){
                premio = 7000;
            }else if (casuale >=0.999995 ) {
                premio = 700;
            }else if( casuale >= 0.999){          //p reali 0.9999375)
                premio = 70;
            }else if(casuale >= 0.99 ){          //p reali 0.9982
                premio = 40;
            }else if(casuale>= 0.98){            //p reali 0.996
                premio = 20;
            }else if(casuale >=0.97){            //p reali 0.995
                premio = 10;
            }else if(casuale >= 0.95){          //p reali 0.98
                premio = 7;
            }else if(casuale>= 0.85){            //p reali 0.9375
                premio = 2;
            }else{
                premio = 1;
            }

             GamePanel.giocatore.setSoldi((double)premio);

            System.out.println("hai vinto: " + premio + "€");
            return true;
            

        }else{
            System.out.println("hai perso");
    
            return false;
        }
        
    }

}