package Stanze.Mercato.Bancarella.SpecificBanc;


import Player.CharacterEquipment.InventoryNew.ConsumableItems;

import Stanze.Mercato.Bancarella.BancItem;


 public  class Carne extends BancItem implements ConsumableItems {

    public Carne(String meatName, double prezzoAlKg){
        super.setItemName(meatName);
        super.setPrezzoAlKg(prezzoAlKg);
        super.setTypeOfBanc("macelleria");
    }
    @Override
    public String toString() {
        return
                "Item name: " + super.getItemName() + '\'' +
                " prezzo al Kg: " + super.getPrezzoAlKg() +
                        " quantita: " + super.getQuantity() +
                        '}';
    }

     @Override
     public void consumeItem() {
         super.consumeQuantity();
     }

 }
