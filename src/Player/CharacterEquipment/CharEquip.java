package Player.CharacterEquipment;

import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
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
        {   do{
            equip.forEach((k,v)-> System.out.println(k + ": " + v));
            System.out.println("0: exit");
            int choice = input.getInt();
            if (choice != 0){
                equip.get(choice).equipItem();
                System.out.println("continue to equip? \n1: yes \n2: no");
                if (input.getInt() == 2){
                    flag = true;
                }
            } else {
               flag = true;
            }
        } while (!flag);
        }
    }
    public int getAllArmor(){
        List<EquippableItems> equipped = new ArrayList<>();
        int armorSum = 0;
        for (EquipSlot item : EquipSlot.values()){
            if (item.isEquipped()){
                equipped.add((EquippableItems)item.getEquippedItem());
            }
        }
        for (EquippableItems item : equipped){
            armorSum += item.getArmor();
        }
        return armorSum;
    }
    public void showAllSlots(){

        for (EquipSlot element : EquipSlot.values()){

                 System.out.println(element.getSlotName() + ": " + element.getEquippedItem());
        }
    }





}
