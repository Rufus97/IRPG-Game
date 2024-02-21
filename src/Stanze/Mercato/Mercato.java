package Stanze.Mercato;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;
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


            for (Bancarella element : newMarket.getAvaibleBancarelle()){
                System.out.println(element.getNomeBancarella());
            }


            //System.out.println("6. Gira per il Mercato");
            System.out.println("0. Esci");
            scelta = In.scanner.nextInt();

            switch (scelta) {

                case 1:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("PESCE FRESCO, ACCATTATE U PESCE");
                    onceYouChosedBanc(newMarket, TipoBancarella.PESCE);
                    break;

                case 2:
                    GamePanel.clearScreen();
                    System.out.println("zucchine fresche");
                    onceYouChosedBanc(newMarket, TipoBancarella.ORTOFRUTTA);
                    break;

                case 3:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("a ciccia bona");
                    onceYouChosedBanc(newMarket, TipoBancarella.MACELLERIA);
                    break;

                case 4:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("cazzatine per tutti ");
                    onceYouChosedBanc(newMarket, TipoBancarella.BIGIOTTERIA);
                    break;
                case 5:
                    GamePanel.clearScreen();
                    //Sottrarre soldi, aggiungere all'inventario.
                    System.out.println("vestiti freschi  ");
                    onceYouChosedBanc(newMarket, TipoBancarella.VESTITI);
                    break;
                case 6:
                    GamePanel.clearScreen();
                    //Mercato.
                    break;
            }


        } while (scelta!=0);
    }

    public void onceYouChosedBanc(Market newMarket, TipoBancarella type){

        int scelta;
        do{
        Bancarella specBanc = newMarket.getSpecificBanc(type);
        OggettiMercanti chosedItem = null;
        System.out.println("puoi comprare: ");
        int index = 1;
        for (OggettiMercanti element : specBanc.getInventarioBancarella()){
            System.out.println(index + ": " + element);
            index++;
        }
        System.out.println("0: per uscire");
            scelta = In.inputInt();
            if (scelta == 0){
                break;
            }
            chosedItem = specBanc.getInventarioBancarella().get(scelta-1);
        if (chosedItem.getTipoOggetto().equals(TipoBancarella.BIGIOTTERIA) ||
            chosedItem.getTipoOggetto().equals(TipoBancarella.VESTITI)) {
            System.out.println(chosedItem.getNome() + " è tuo per la modica cifra di " + chosedItem.getPrezzo());
        }
        else {
        System.out.println("quanti grammi de " + chosedItem.getNome() + " vole signò?");
        scelta = In.inputInt();

        double costo = chosedItem.getPrezzoAlKg() * scelta / 1000;
            if (GamePanel.giocatore.controllaSoldi(costo)){
                Oggetto newItem = new Oggetto(chosedItem.getNome(), scelta);
                GamePanel.inventario.aggiungiItem(newItem);
                System.out.println("hai acquistato " + scelta + " grammi di " + chosedItem.getNome() + " per " + costo);
                System.out.println("VOLE QUALCOSALTRO SIGNO???");
            }
        }
        System.out.println("premi un numero per continuare\n" +
                "premi 0 per uscire");
        scelta = In.inputInt();
        } while (scelta > 0);
    }
}

