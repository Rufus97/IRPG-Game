package Stanze.Tabacchino;

import Input.In;
import Main.GamePanel;
import Stanze.Slot;

public class Tabacchino{
    public Tabacchino(){
        
    }

    public void runTabacchino(){

        DiecieLotto diecieLotto = new DiecieLotto();

        int scelta;
       
        do {System.out.println("I tuoi Soldi " + GamePanel.giocatore.getSoldi());
            System.out.println("Sei nel Tabacchino, Cosa vuoi fare?");
            System.out.println("1. Gioca a 10eLotto");
            System.out.println("2. Gioca al 7 e Mezzo 1E");
            System.out.println("3. Compra Sigarette");
            System.out.println("4. Gioca Slot");
            

            System.out.println("0. Esci");


            scelta = In.scanner.nextInt();
            switch (scelta) {
                case 1:
                GamePanel.clearScreen();
                diecieLotto.gioca10eLotto();
                break;

                case 2:
                GamePanel.clearScreen();
                SetteMezzo.giocaSetteMezzo();
                break;

                case 3:
                GamePanel.clearScreen();
                Sigarette.compraSigarette();
                break;

                case 4:
                GamePanel.clearScreen();
                Slot.giocaSlot();
                break;

                case 0:
                GamePanel.clearScreen();
                System.out.println("Bella zi");
                break;
        
            }
            
        } while (scelta!=0);
    }
}
