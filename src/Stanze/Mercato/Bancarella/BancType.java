package Stanze.Mercato.Bancarella;

import Player.CharacterEquipment.EquipSlot;
import Stanze.Mercato.Bancarella.SpecificBanc.*;

import java.util.Arrays;
import java.util.List;

public enum BancType {
    PESCE (Arrays.asList(
            new Pesce("aringa" , 18, 15),
            new Pesce("merluzzo", 16, 13),
            new Pesce("platessa", 21, 20),
            new Pesce("cozze" , 10, 5),
            new Pesce("vongole", 16, 13),
            new Pesce("tonno", 14, 20)
    ), "Pescheria"),
    CARNE (Arrays.asList(
            new Carne("Pollo" , 14, 15),
            new Carne("Tacchino", 16, 20 ),
            new Carne("Manzo", 21, 20),
            new Carne("Maiale" , 10, 20),
            new Carne("Salsicce", 16, 20),
            new Carne("Hamburger", 14, 20)
    ), "Macelleria"),
    ORTAGGI( Arrays.asList(
            new Ortaggi("Zucchine" , 18, 20),
            new Ortaggi("Melanzane", 16, 20),
            new Ortaggi("Patate", 21, 20),
            new Ortaggi("Pomodori" , 10, 20),
            new Ortaggi("Fagioli", 16, 20),
            new Ortaggi("Banane", 14, 20)
    ), "Verduraio"),
    VESTITI( Arrays.asList(
            new Vestiti("Pantalone" , 18, 1, EquipSlot.LEGS),
            new Vestiti("Barbon gloves", 16, 1, EquipSlot.HANDS),
            new Vestiti("mithril armor", 21, 5, EquipSlot.TORSO),
            new Vestiti("belt of giant's strength" , 10, 2, EquipSlot.BELT),
            new Vestiti("maglietta bellina", 16, 1, EquipSlot.TORSO),
            new Vestiti("maglietta bruttina", 14, 2, EquipSlot.TORSO)
    ), "Barbon shop"),
    BIGIOTTERIA (
            Arrays.asList(
            new Bigiotteria("anello" , 18, EquipSlot.RING_ONE),
            new Bigiotteria("collana", 16, EquipSlot.ACCESSORY),
            new Bigiotteria("maden ring", 21, EquipSlot.RING_ONE),
            new Bigiotteria("mantello" , 10, EquipSlot.ACCESSORY),
            new Bigiotteria("anello di diamanti", 16, EquipSlot.ACCESSORY),
            new Bigiotteria("anello di bronzo", 14, EquipSlot.RING_ONE)
    ), "Cazzatine varie");

    private List<BancItem> inventory;

    private String name;
    private BancType(List<BancItem> inventory, String name) {
        this.inventory = inventory;
        this.name = name;
    }
    public List<BancItem> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }
}
