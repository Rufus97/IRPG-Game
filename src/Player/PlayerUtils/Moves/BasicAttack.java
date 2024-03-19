package Player.PlayerUtils.Moves;

import Main.GamePanel;
import Main.Utility.Moves;
import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.EquippableItems;

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
        return dmg + EquipSlot.WEAPON.getEquippedItem().getDanni();
    }

    @Override
    public void moveEff() {

    }

}
