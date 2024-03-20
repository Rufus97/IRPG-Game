package Main.Utility;

import java.util.List;
import java.util.Map;

public interface Entity {

    public int getHp();
    public void entIsDmg(int dmg);
    public Map<Integer, Moves> getMoves();
}
