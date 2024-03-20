package Player.PlayerUtils.Moves;

import Main.Utility.Moves;
import Player.CharacterEquipment.EquipSlot;

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

        if (EquipSlot.WEAPON.isEquipped()){
        return dmg + EquipSlot.WEAPON.getEquippedItem().getDanni();
        } else {
            return dmg;
        }
    }

    @Override
    public void moveEff() {
    }

}
