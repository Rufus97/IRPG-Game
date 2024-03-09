package Stanze.Mercato.AzioniMercato.CharacterEquipment;

import Main.GamePanel;
import Player.Oggetto;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.EquippableItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharEquip {

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




}
