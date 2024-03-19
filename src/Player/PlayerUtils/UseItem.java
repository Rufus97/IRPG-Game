package Player.PlayerUtils;

import Main.Utility.Moves;

public class UseItem implements Moves {
    String name = "Use item";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDmg() {
        return 0;
    }

}
