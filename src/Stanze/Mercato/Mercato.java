package Stanze.Mercato;

import Input.In;
import Main.GamePanel;
import Player.Inventario;
import Player.Oggetto;
import Player.Personaggio;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Logic.Market;

import java.util.List;
import java.util.Map;

public class Mercato {


    private String nome;
    public Mercato(String nome){
        this.nome = nome;
    }

    public void runMercato(){
        Market runningMarket = new Market();
        Integer choice = 0;
        do {
        System.out.println("dove vai?");
        for (Map.Entry<Integer, List<BancItem>> banc : runningMarket.getMapOfBancs().entrySet()){
            System.out.println(":" + (banc.getKey()+1) + " per  " + banc.getValue().getFirst().getTypeOfBanc());
        }
        System.out.println(":" + 0 + " per uscire");
        choice = In.inputInt();
        if (choice > 0 && choice < BancType.values().length+1){
        BancItem shoppedItem = shopping(runningMarket, choice-1);
            if (shoppedItem != null){
            calculatePrice(shoppedItem);
            }
        }
        else {
            System.out.println("cerchi una bancarella che non esiste in balia dell' alzheimer, " +
                    " il camminare senza meta, immerso nelle urla dei mercanti, raffiora in te il ricordo del campo di battaglia, " +
                    " il tuo cuore si riempe di gioia al ricordo dei TEDESKEN perforati dai tuoi proiettili, " +
                    " sino a che le loro urla non si perdono tra quelle dei mercanti, e con esse i tuoi ricordi, " +
                    " ti fanno male i piedi e ti sei cagato addosso ");

        }
        } while (choice != 0);
    }



    public BancItem shopping(Market inizializedMarket, Integer userChoice){
        List<BancItem> shopInventory = inizializedMarket.getOneRandomInventory(userChoice);
        int index = 1;
        int choice = 0;
        BancItem chosedItem;
        System.out.println("cosa desidera? ");
        for (BancItem item : shopInventory){
            System.out.println(index+ ": " + item);
            index ++;
        }
        System.out.println(0 + ": per uscire");
        choice = In.inputInt();
        if (choice == 0){
           return null;
        } else {
        chosedItem = shopInventory.get(choice-1);
        return chosedItem;
        }
    }


    public void calculatePrice(BancItem item){
        double price = 0;
        int quantity = 0;
        BancItem chosedItem = item;
        if (item.getPrezzoAlKg() == 0){
            price = item.getPrice();
            System.out.println("hai comprato " + item.getItemName() + " per " + price);
            quantity += 1;
        } else {
             System.out.println("quanti grammi vuoi?: ");
             int grammi = In.inputInt();
             quantity += grammi;
             price = item.getPrezzoAlKg() * grammi / 1000;
            System.out.println("hai comprato " + grammi + " di " + item.getItemName() + " per " + price);
        }
        Oggetto shoppedItem = new Oggetto(chosedItem.getItemName(),quantity);


        if (GamePanel.giocatore.controllaSoldi(-price)){
            playerGetItem(shoppedItem);
        }
    }

    public void playerGetItem(Oggetto chosedItem){


        GamePanel.inventario.aggiungiItem(chosedItem);
        GamePanel.inventario.quantitaItem(chosedItem);

        System.out.println(GamePanel.inventario);
        System.out.println("Soldi attuali: " + GamePanel.giocatore.getSoldi());
    }

}
