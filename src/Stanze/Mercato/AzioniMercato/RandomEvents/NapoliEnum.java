package Stanze.Mercato.AzioniMercato.RandomEvents;

import Stanze.Mercato.AzioniMercato.Utility.Entity;
import Stanze.Mercato.AzioniMercato.Utility.Moves;

import java.util.Arrays;
import java.util.List;

public enum NapoliEnum implements Entity{
    GOLLUM(10, Arrays.asList(new NapoliMoves(1, "basic attack"), new NapoliMoves(5, "my precious"))),
    SMILZO(20, Arrays.asList(new NapoliMoves(3, "basic attack"), new NapoliMoves(7, "mozzarella strike"))),
    NORMALE(30, Arrays.asList(new NapoliMoves(5, "basic attack"), new NapoliMoves(10, "backstab"))),
    PIAZZATO(40, Arrays.asList(new NapoliMoves(10, "basic attack"), new NapoliMoves(15, "mandolin combo"))),
    LEGGENDARIO(60, Arrays.asList(new NapoliMoves(20, "basic attack"), new NapoliMoves(5, "vesuvian punch")));

    private int napoleanHp;

    private List<Moves> moves;


    public int getNapoleanHp() {
        return napoleanHp;
    }

    NapoliEnum( int napoleanHp, List<Moves> moves) {
        this.napoleanHp = napoleanHp;
        this.moves = moves;
    }


    @Override
    public int getHp() {
        return this.napoleanHp;
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public List<Moves> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return
                "napoli hp: " + napoleanHp
               ;
    }
}
