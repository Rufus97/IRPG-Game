package Stanze.Parco.BruEntity;

import Main.Utility.Moves;

public class BruMov implements Moves {
    private String name;
    private int dmg;
    public BruMov(String name, int dmg){
        this.name = name;
        this.dmg = dmg;
    }


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
