package Stanze.Mercato.Bancarella;

import Stanze.Mercato.Bancarella.SpecificBanc.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum BancType {

    PESCE (Pesce.getInvetarioPesce()),
    CARNE (Carne.getInventarioCarne()),
    ORTAGGI(Ortaggi.getInvetarioOrtaggi()),
    VESTITI(Vestiti.getInvetarioVestiti()),
    BIGIOTTERIA(Bigiotteria.getInventarioBigiotti());

    ArrayList<Bancarella> inventory;

    private BancType(List<Bancarella> getInvetario){
        inventory = new ArrayList<>(getInvetario);
    }

    public List<Bancarella> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "BancType{" +
                "inventory=" + inventory +
                '}';
    }
}
