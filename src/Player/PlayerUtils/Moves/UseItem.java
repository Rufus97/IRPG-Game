package Player.PlayerUtils.Moves;

import Input.In;
import Main.MyException;
import Main.Utility.Moves;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;

public class UseItem implements Moves {

    private String name = "Use Item";

    public static UseItem Uitem = new UseItem();

    private UseItem(){};

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
        try {
            NewInventory.getInventory().getAllConsumables().forEach((k, v) ->
                    System.out.println(k + ": " + v));
            ConsumableItems choice = NewInventory.getInventory().getAllConsumables().get(In.inputInt());
            NewInventory.getInventory().consumeAnItem(choice);
        }catch (NullPointerException e){
            System.out.println("non hai consumabili");
        }

    }
}
