package Stanze.Mercato;

import Input.In;
import Main.GamePanel;

public class Mercato {

    String nome;

    //Costruttore
    public Mercato(String nome) {
        this.nome = nome;
    }
    public void runMercato() {
        int scelta;

        do {GamePanel.giocatore.mostraStatistiche();
            System.out.println("Sei nel Mercato, Cosa vuoi fare?");
            System.out.println("1. Compra in Pescheria.");
            System.out.println("2. Compra in Ortofrutta");
            System.out.println("3. Compra in Macelleria");
            System.out.println("4. Compra della bigiotteria.");
            System.out.println("5. Compra dei vestiti usati.");
            //System.out.println("6. Gira per il Mercato");


            System.out.println("0. Esci");


            scelta = In.scanner.nextInt();
            switch (scelta) {
                case 1:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("working progress...");
                    break;

                case 2:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("working progress...");
                    break;

                case 3:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("working progress...");
                    break;

                case 4:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("working progress...");
                    break;
                case 5:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("working progress...");
                    break;
                /*case 6:
                    GamePanel.clearScreen();
                    //Mercato.
                    break;*/
            }

        } while (scelta!=0);
    }
}

