package Stanze.Mercato.AzioniMercato.Utility.TestsPar;

import Main.GamePanel;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.CharEquip;
import Stanze.Mercato.AzioniMercato.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.Utility.TestPar;

public class TestHp implements TestPar {

    private int hp = GamePanel.giocatore.getHP();
    private int armorValue = CharEquip.getPlayerEquipment().getAllArmor();
    @Override
    public boolean runTest() {
        if (this.hp <= 0){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void getPar() {

    }
}
