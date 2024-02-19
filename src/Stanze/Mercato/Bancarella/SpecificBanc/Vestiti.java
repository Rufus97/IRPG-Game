package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vestiti extends Bancarella{
    static List<Bancarella> inventarioVestiti = new ArrayList<>(
            Arrays.asList(
                    new Vestiti("Pantalone" , 18),
                    new Vestiti("Barbon gloves", 16),
                    new Vestiti("mithril armor", 21),
                    new Vestiti("belt of giant's strength" , 10),
                    new Vestiti("maglietta bellina", 16),
                    new Vestiti("maglietta bruttina", 14)
            )
    );

    public Vestiti(String clothName, double prezzo){
        super.setBancName(clothName);
        super.setPrice(prezzo);
    }

    public static List<Bancarella> getInvetarioVestiti() {
        return inventarioVestiti;
    }
}
