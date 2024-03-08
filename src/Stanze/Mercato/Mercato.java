package Stanze.Mercato;

import Main.GamePanel;
import Player.Oggetto;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.Mercato.AzioniMercato.RandomEvents.Napoletano;
import Stanze.Mercato.AzioniMercato.RandomEvents.TreCarte;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Logic.Market;

import java.util.List;
import java.util.Map;

public class Mercato {

    private MercatoInputs input = new MercatoInputs();
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
        choice = input.getInt();
        if (choice > 0 && choice < BancType.values().length+1){
        BancItem shoppedItem = shopping(runningMarket, choice-1, input);
            if (shoppedItem != null){
            calculatePrice(shoppedItem, input);
            }
        }
        } while (choice != 0);
    }



    public BancItem shopping(Market inizializedMarket, int userChoice, MercatoInputs newInput){

        List<BancItem> shopInventory = inizializedMarket.getOneRandomInventory(userChoice);
        RandomDice rng = new RandomDice();
        int index = 1;
        Integer rngResult = rng.getDado(1,10);
        if (rngResult > 1 && rngResult <= 3){
            TreCarte treCarte = new TreCarte();
            System.out.println("come il canto di una sirena, le urla di un tizio poco affidabile" +
                    " ti incantano sino a raggiungere il tavolo, l'incantatore prestigia con 3 carte " +
                    " e ti invita a sceglierne 1");
            treCarte.runAction(newInput);
        }
        if (rngResult == 1){
            Napoletano ciro = new Napoletano();
            ciro.furto(newInput);
        }

        BancItem chosedItem;
        System.out.println("cosa desidera? ");
        for (BancItem item : shopInventory){
            System.out.println(index+ ": " + item);
            index ++;
        }
        System.out.println(0 + ": per uscire");

        userChoice = newInput.getInt();


        if (userChoice == 0){
           return null;
        } else if (userChoice > 0 && userChoice <= shopInventory.size()){
        chosedItem = shopInventory.get(userChoice-1);
        return chosedItem;
        } else {
            System.out.println("non ci sta quello che vuoi te, torni a vedere le bancarelle");
            return null;
        }
    }


    public void calculatePrice(BancItem item, MercatoInputs input){
        double price = 0;
        int quantity = 0;
        BancItem chosedItem = item;
        if (item.getPrezzoAlKg() == 0){
            price = item.getPrice();
            System.out.println("hai comprato " + item.getItemName() + " per " + price);
            quantity += 1;
        } else {
             System.out.println("quanti grammi vuoi?: ");
             int grammi = input.getInt();
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
