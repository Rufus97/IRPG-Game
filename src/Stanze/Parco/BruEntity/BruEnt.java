package Stanze.Parco.BruEntity;

import Input.In;
import Main.Utility.Entity;
import Main.Utility.Moves;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BruEnt implements Entity {

   private int hp = 50;

   private Map<Integer, Moves> bruKit = Map.of(1,  new BruMov("basic attack", 5),
           2, new BruMov("A BOMBAZZA ", 40),
           3,  new BruMov("Bycycle swing ", 20) );



    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public void entIsDmg(int dmg) {
        this.hp -= dmg;
    }

    @Override
    public Map<Integer, Moves> getMoves() {
        return this.bruKit;
    }

    @Override
    public String toString() {
        return "Brumotti " +
                "hp: " + hp ;
    }
}
