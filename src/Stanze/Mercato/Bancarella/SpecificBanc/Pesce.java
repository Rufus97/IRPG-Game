package Stanze.Mercato.Bancarella.SpecificBanc;

import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Bancarella.Bancarella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pesce extends Bancarella {



    static List<Bancarella>  invetarioPesce = new ArrayList<>(
            Arrays.asList(
                    new Pesce("aringa" , 18),
                    new Pesce("merluzzo", 16),
                    new Pesce("platessa", 21),
                    new Pesce("cozze" , 10),
                    new Pesce("vongole", 16),
                    new Pesce("tonno", 14)
            )
    );

    public Pesce(String fishName, double prezzoAlKg){
        super.setBancName(fishName);
        super.setPrezzoAlKg(prezzoAlKg);
    }

    public static List<Bancarella> getInvetarioPesce() {
        return invetarioPesce;
    }
}
