package Stanze.bar.mossa;

import Main.Utility.Moves;

public class AttaccoBase implements Moves {

    private String name = "attacco base";
    private int dmg = 5;

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
