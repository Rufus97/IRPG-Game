package Stanze.Mercato.AzioniMercato.RandomEvents;

import Main.Utility.Entity;
import Main.Utility.Moves;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public enum NapoliEnum implements Entity{
    GOLLUM(10, Map.of(1, new NapoliMoves(1, "basic attack"), 2, new NapoliMoves(5, "my precious"))),
    SMILZO(20, Map.of(1, new NapoliMoves(3, "basic attack"), 2, new NapoliMoves(7, "mozzarella strike"))),
    NORMALE(30, Map.of(1, new NapoliMoves(5, "basic attack"), 2, new NapoliMoves(10, "backstab"))),
    PIAZZATO(40, Map.of(1, new NapoliMoves(10, "basic attack"), 2, new NapoliMoves(15, "mandolin combo"))),
    LEGGENDARIO(60, Map.of(1, new NapoliMoves(20, "basic attack"), 2, new NapoliMoves(50, "vesuvian punch")));

    private int napoleanHp;

    private Map<Integer, Moves> moves;


    public int getNapoleanHp() {
        return napoleanHp;
    }

    NapoliEnum( int napoleanHp, Map<Integer, Moves> moves) {
        this.napoleanHp = napoleanHp;
        this.moves = moves;
    }


    @Override
    public int getHp() {
        return this.napoleanHp;
    }


    @Override
    public void entIsDmg(int dmg) {
        this.napoleanHp -= dmg;
    }

    @Override
    public Map<Integer, Moves> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return
                "napoli hp: " + napoleanHp + '\n'
               ;
    }
}
