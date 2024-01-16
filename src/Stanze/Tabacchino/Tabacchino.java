package Stanze.Tabacchino;

import Input.In;
import Main.Main;               //IMPORTA QUESTO SE VUOI METTERE MANI AL GIOCATORE
import Player.Personaggio;        //IMPORTA QUESTO SE VUOI METTERE MANI AL GIOCATORE

public class Tabacchino{
    public Tabacchino(){
        
    }

    public void runTabacchino(){

        DiecieLotto diecieLotto = new DiecieLotto();
        SetteMezzo setteMezzo = new SetteMezzo();

        int scelta;
       
        do {System.out.println("Sei nel Tabacchino, Cosa vuoi fare?); (1. Gioca a 10eLotto, 2.Gioca al 7 e Mezzo)");
            System.out.println("1. Gioca a 10eLotto");
            System.out.println("2. Gioca al 7 e Mezzo");
            System.out.println("3. Esci");


            scelta = In.scanner.nextInt();
            switch (scelta) {
                case 1:
                diecieLotto.gioca10eLotto();
                break;

                case 2:
                setteMezzo.giocaSetteMezzo();
                break;
                case 3:
                System.out.println("Bella zi");
                break;
        
            }
            
        } while (scelta!=3);
        
    }
}
