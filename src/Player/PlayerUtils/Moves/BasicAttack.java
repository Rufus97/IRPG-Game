package Player.PlayerUtils.Moves;

import Main.GamePanel;
import Main.Utility.Moves;

public class BasicAttack implements Moves {

    String name = "Basic Attack";

    int dmg = 5;

    public static BasicAttack Ba = new BasicAttack();

    private BasicAttack(){}
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDmg() {
        return this.dmg;
    }

    @Override
    public void moveEff() {

    }

}
