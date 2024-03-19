package Stanze.bar.mossa;

import Main.Utility.Moves;

import java.lang.module.ModuleFinder;

public class DropKick implements Moves {
    private String name = "doppio calcio";
    private int dmg = 10;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDmg() {
        return dmg;
    }

    @Override
    public void moveEff() {

    }
}
