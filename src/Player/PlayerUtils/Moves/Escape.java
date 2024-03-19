package Player.PlayerUtils.Moves;

import Input.In;
import Main.Utility.Moves;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.RandomDice;

public class Escape {
    public class UseItem implements Moves {

        private String name = "Use Item";

        RandomDice rng = new RandomDice();



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

        public boolean escapeEff(){
            if (rng.getDado(1,20) >= 15){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
