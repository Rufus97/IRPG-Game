package Stanze.Mercato.Bancarella.SpecificBanc;


import Main.GamePanel;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;

import Stanze.Mercato.Bancarella.BancItem;


 public  class Carne extends BancItem implements ConsumableItems {
    public int restoreValue;
    public Carne(String meatName, double prezzoAlKg, int restoreValue){
        super.setItemName(meatName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("macelleria");
        this.restoreValue = restoreValue;
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo al Kg: " + super.getPrezzoAlKg() +
                " quantita: " + super.getQuantity() +
                '}';
    }

     public int getRestoreValue() {
         return restoreValue;
     }

     @Override
     public String getItemName() {
         return super.getItemName();
     }

     @Override
     public void consumeItem() {
         super.consumeQuantity();
         GamePanel.giocatore.controlloSetHP(this.restoreValue);
     }

     @Override
     public int healAmount() {
         return this.restoreValue;
     }

 }
