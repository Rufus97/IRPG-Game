package Stanze.Mercato;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;
import Player.Personaggio;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Logic.Market;

import java.util.List;
import java.util.Map;

public class Mercato {

    private String name;

    public Mercato(String name){
        this.name = name;
    }

    public void runMercato(){
        Market runningMarket = new Market();
        System.out.println("dove vai?");
        for (Map.Entry<Integer, List<BancItem>> banc : runningMarket.getMapOfBancs().entrySet()){
            System.out.println(":" + (banc.getKey()+1) + " per  " + banc.getValue().getFirst().getTypeOfBanc());
        }
        Integer choice = In.inputInt();
        calculatePrice(shopping(runningMarket, choice-1));
    }
    public BancItem shopping(Market inizializedMarket, Integer userChoice){
        List<BancItem> shopInventory = inizializedMarket.getOneRandomInventory(userChoice);
        int index = 1;
        BancItem chosedItem;
        for (BancItem item : shopInventory){
            System.out.println(index+ ": " + item);
            index ++;
        }
        chosedItem = shopInventory.get(In.inputInt()-1);
        System.out.println("hai scelto " + chosedItem.getItemName());
        return chosedItem;
    }
    public void calculatePrice(BancItem item){
        double price = 0;
        if (item.getPrezzoAlKg() == 0){
            price = item.getPrice();
            System.out.println("hai comprato " + item.getItemName() + " per " + price);
        } else {
             System.out.println("quanti grammi vuoi?: ");
             int grammi = In.inputInt();
             price = item.getPrezzoAlKg() * grammi / 1000;
            System.out.println("hai comprato " + grammi + " di " + item.getItemName() + " per " + price);
        }

        if (GamePanel.giocatore.controllaSoldi(price)){
            Oggetto item = new Oggetto()
            GamePanel.inventario.aggiungiItem();
        }

    }
}
