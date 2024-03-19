package Stanze.bar.azioni.entyties;

import Main.Utility.Entity;
import Main.Utility.Moves;
import Stanze.bar.mossa.AttaccoBase;
import Stanze.bar.mossa.DropKick;

import java.util.HashMap;
import java.util.Map;

public class Barista implements Entity {

    private int HP = 30;

    Map<Integer, Moves> moves = Map.of(1, new AttaccoBase(), 2, new DropKick());
    @Override
    public int getHp() {
        return this.HP;
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public void entIsDmg(int dmg) {
        this.HP -= dmg;
    }

    @Override
    public Map<Integer, Moves> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "Barista{" +
                "HP=" + HP +
                '}';
    }
}
