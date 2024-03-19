package Player.PlayerUtils.Moves;

import Main.Utility.Moves;

public class useIt implements Moves {

    private String name = "Use Item";



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public void moveEff() {

    }
}
