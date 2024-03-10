package Stanze.Mercato.AzioniMercato.CharacterEquipment;

import Main.GamePanel;
import Player.Oggetto;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.Inventory;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.MercatoInputs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharEquip {

    private MercatoInputs input = new MercatoInputs();

    private int armorStat;

    private Map<EquipSlot, EquippableItems> playerSlots = new HashMap<>();

    private static CharEquip playerEquipment = new CharEquip();
    private CharEquip(){
        initializeSlots();
    }
    public void initializeSlots(){
        for (EquipSlot slots : EquipSlot.values()){
            playerSlots.put(slots, null);
        }
    }

    public static CharEquip getPlayerEquipment() {
        return playerEquipment;
    }

    public void equipItem(MercatoInputs input){
        NewInventory inventory = NewInventory.getInventory();

        System.out.println("wich item you want to equip?");
        Map<Integer, EquippableItems> equip = inventory.getAllEquipment();
        choseAnItem(equip);
        showAllSlots();


    }
    public void choseAnItem(Map<Integer, EquippableItems> equip){
    boolean flag = false;
    while (!flag){
        equip.forEach((k,v)-> System.out.println(k + ": " + v));
        int choice = input.getInt();
        equip.get(choice).equipItem();
        System.out.println("continue to equip? \n1: yes \n2: no");
        if (input.getInt() == 2){
            flag = true;
        }
    }
    }
    public void showAllSlots(){

        for (EquipSlot element : EquipSlot.values()){

                 System.out.println(element.getSlotName() + ": " + element.getEquippedItem());

        }
    }





}