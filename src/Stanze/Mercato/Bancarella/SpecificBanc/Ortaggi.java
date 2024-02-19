package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ortaggi extends Bancarella {
    private double prezzoAlKg;

    private String fishName;

    private BancType bancType = BancType.PESCE;

    static List<Bancarella> inventarioOrtaggi = new ArrayList<>(
            Arrays.asList(
                    new Ortaggi("Zucchine" , 18),
                    new Ortaggi("Melanzane", 16),
                    new Ortaggi("Patate", 21),
                    new Ortaggi("Pomodori" , 10),
                    new Ortaggi("Fagioli", 16),
                    new Ortaggi("Banane", 14)
            )
    );

    public Ortaggi(String ortaggiName, double prezzoAlKg){
        super.setBancName(ortaggiName);
        super.setPrezzoAlKg(prezzoAlKg);
    }

    public static List<Bancarella> getInvetarioOrtaggi() {
        return inventarioOrtaggi;
    }
}
