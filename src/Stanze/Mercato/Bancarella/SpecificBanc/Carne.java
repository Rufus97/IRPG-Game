package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carne extends Bancarella{
    static List<Bancarella> inventarioCarne = new ArrayList<>(
            Arrays.asList(
                    new Carne("Pollo" , 14),
                    new Carne("Tacchino", 16),
                    new Carne("Manzo", 21),
                    new Carne("Maiale" , 10),
                    new Carne("Salsicce", 16),
                    new Carne("Hamburger", 14)
            )
    );

    public Carne(String meatName, double prezzoAlKg){
        super.setBancName(meatName);
        super.setPrezzoAlKg(prezzoAlKg);
    }

    public static List<Bancarella> getInventarioCarne() {
        return inventarioCarne;
    }
}
