package Stanze.Mercato.Bancarella;

import Stanze.Mercato.Bancarella.SpecificBanc.Pesce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bancarella {
    private double prezzoAlKg;

    private String bancName;

    private double price;

    public static Map<BancType, List<Bancarella>> mapOfBancs = new HashMap<>();

    public Bancarella(){
     for (int i = 0; i < BancType.values().length; i++){
         mapOfBancs.put(BancType.values()[i], BancType.PESCE.getInventory());
     }
    }

    public static List<Bancarella> checkInventory(){

    }

    public double getPrezzoAlKg() {
        return prezzoAlKg;
    }
    public String getBancName() {
        return bancName;
    }

    public void setPrezzoAlKg(double prezzoAlKg) {
        this.prezzoAlKg = prezzoAlKg;
    }
    public void setBancName(String bancName) {
        this.bancName = bancName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public Map<BancType, List<Bancarella>> getMapOfBancs() {
        return mapOfBancs;
    }


    @Override
    public String toString() {
        return "Bancarella{" +
                "prezzoAlKg=" + prezzoAlKg +
                ", bancName='" + bancName + '\'' +
                ", price=" + price +
                ", mapOfBancs=" + mapOfBancs +
                '}';
    }
}
