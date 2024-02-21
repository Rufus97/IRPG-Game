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
    private BancType typeOfBanc;
    public Map<BancType, List<MarketObjects>> mapOfBancs = new HashMap<>();
    public Bancarella(){
    }


    public void fillMap(){
        for (int i = 0; i < BancType.values().length; i++){
            BancType.values()[i].getInventory().get(0).fillBanc();
        }
    }

    // getter and setters
    public BancType getTypeOfBanc() {return typeOfBanc;}
    public double getPrice() {return price;}
    public Map<BancType, List<MarketObjects>> getMapOfBancs() {
        return mapOfBancs;
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
    public void setTypeOfBanc(BancType typeOfBanc) {
        this.typeOfBanc = typeOfBanc;
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
