package Stanze.Mercato.AzioniMercato.RandomEvents;

import Stanze.Mercato.AzioniMercato.Utility.Moves;
import org.mockito.Mockito;

public class NapoliMoves implements Moves {
    private int dmg;
    private String moveName;
    public NapoliMoves(int dmg, String moveName){
        this.dmg = dmg;
        this.moveName = moveName;
    }

    @Override
    public String getName() {
        return this.moveName;
    }

    @Override
    public int getDmg() {
        return this.dmg;
    }
}
