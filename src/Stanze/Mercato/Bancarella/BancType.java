package Stanze.Mercato.Bancarella;

import Stanze.Mercato.Bancarella.SpecificBanc.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum BancType {
    PESCE (Arrays.asList(
            new Pesce("aringa" , 18),
            new Pesce("merluzzo", 16),
            new Pesce("platessa", 21),
            new Pesce("cozze" , 10),
            new Pesce("vongole", 16),
            new Pesce("tonno", 14)
    )),
    CARNE (Arrays.asList(
            new Carne("Pollo" , 14),
            new Carne("Tacchino", 16),
            new Carne("Manzo", 21),
            new Carne("Maiale" , 10),
            new Carne("Salsicce", 16),
            new Carne("Hamburger", 14)
    )),
    ORTAGGI( Arrays.asList(
            new Ortaggi("Zucchine" , 18),
            new Ortaggi("Melanzane", 16),
            new Ortaggi("Patate", 21),
            new Ortaggi("Pomodori" , 10),
            new Ortaggi("Fagioli", 16),
            new Ortaggi("Banane", 14)
    )),
    VESTITI( Arrays.asList(
            new Vestiti("Pantalone" , 18),
            new Vestiti("Barbon gloves", 16),
            new Vestiti("mithril armor", 21),
            new Vestiti("belt of giant's strength" , 10),
            new Vestiti("maglietta bellina", 16),
            new Vestiti("maglietta bruttina", 14)
    )),
    BIGIOTTERIA (
            Arrays.asList(
            new Bigiotteria("anello" , 18),
            new Bigiotteria("collana", 16),
            new Bigiotteria("maden ring", 21),
            new Bigiotteria("mantello" , 10),
            new Bigiotteria("anello di diamanti", 16),
            new Bigiotteria("anello di bronzo", 14)
    ));

    private List<MarketObjects> inventory;
    private BancType(List<MarketObjects> inventory) {
        this.inventory = inventory;
    }
    public List<MarketObjects> getInventory() {
        return inventory;
    }


}
