package Stanze.Parco.BruEntity;

import Main.Utility.Entity;
import Main.Utility.Moves;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruEnt implements Entity {

   private int hp = 50;

   private List<Moves> bruMov = new ArrayList<>(
           Arrays.asList(
                   new BruMov("basic attack", 5),
                   new BruMov("A BOMBAZZA ", 40),
                   new BruMov("Bycycle swing ", 20)
           )
   );


    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public List<Moves> getMoves() {
        return this.bruMov;
    }

    @Override
    public String toString() {
        return "Brumotti " +
                "hp: " + hp ;
    }
}
