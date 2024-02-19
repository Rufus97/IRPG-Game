package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.Bancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigiotteria extends Bancarella{
    static List<Bancarella> inventarioBigiotti = new ArrayList<>(
            Arrays.asList(
                    new Bigiotteria("anello" , 18),
                    new Bigiotteria("collana", 16),
                    new Bigiotteria("maden ring", 21),
                    new Bigiotteria("mantello" , 10),
                    new Bigiotteria("anello di diamanti", 16),
                    new Bigiotteria("anello di bronzo", 14)
            )
    );

    public Bigiotteria(String bigioName, double prezzo){
        super.setBancName(bigioName);
        super.setPrice(prezzo);
    }

    public static List<Bancarella> getInventarioBigiotti() {
        return inventarioBigiotti;
    }
}
