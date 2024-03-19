package Player.PlayerUtils.Moves;

import Input.In;
import Main.Utility.Moves;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;

public class UseItem implements Moves {

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
        ConsumableItems choice = NewInventory.getInventory().getAllConsumables().get(In.inputInt());
        NewInventory.getInventory().consumeAnItem(choice);
    }
}
