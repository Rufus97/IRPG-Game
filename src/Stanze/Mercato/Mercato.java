package Stanze.Mercato;

import Input.In;
import Main.GamePanel;
import Player.Personaggio;
import Stanze.Mercato.LogicaMercato.Bancarella;
import Stanze.Mercato.LogicaMercato.Market;
import Stanze.Mercato.OggettiMercanti.OggettiMercanti;
import Stanze.Mercato.OggettiMercanti.TipoBancarella;

public class Mercato {

    String nome;

    //Costruttore
    public Mercato(String nome) {
        this.nome = nome;
    }
    public void runMercato() {
        int scelta;
        Market newMarket = new Market();

        do {GamePanel.giocatore.mostraStatistiche();
            System.out.println("Sei nel Mercato e le bancarelle che vedi sono: ");
            newMarket.getAllAvaibleNames(newMarket.getAvaibleBancarelle());
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
                    System.out.println("PESCE FRESCO, ACCATTATE U PESCE");
                    onceYouChosedBanc(newMarket);


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

    public void onceYouChosedBanc(Market newMarket){
        int scelta;
        Bancarella specBanc = newMarket.getSpecificBanc(TipoBancarella.PESCE);
        OggettiMercanti chosedItem = null;
        System.out.println("puoi comprare: ");
        int index = 1;
        for (OggettiMercanti element : specBanc.getInventarioBancarella()){

            System.out.println(index + ": " + element);
            index++;
        }
        scelta = In.inputInt()-1;
        chosedItem = specBanc.getInventarioBancarella().get(scelta);
        System.out.println("quanti grammi de " + chosedItem.getNome() + " vole signò?");
        scelta = In.inputInt();
        double costo = chosedItem.getPrezzoAlKg() * scelta / 1000;
        System.out.println("hai acquistato " + scelta + " grammi di " + chosedItem.getNome() + " per " + costo);
    }
}

