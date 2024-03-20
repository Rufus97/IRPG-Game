package Stanze.Parco.BruEntity.Guards;

import Main.Utility.Entity;
import Main.Utility.Moves;

import java.util.List;
import java.util.Map;

public class InfamousGuards implements Entity {

    Map<Integer, Moves> gMoves = Map.of(1,new GuardAttack());

    private int hp = 15;

    @Override
    public int getHp() {
        return hp;
    }



    @Override
    public void entIsDmg(int dmg) {
     this.hp -= dmg;
    }

    @Override
    public Map<Integer, Moves> getMoves() {
        return this.gMoves;
    }

    @Override
    public String toString() {
        return "InfamousGuards: " +
                "hp=" + hp;
    }
}
