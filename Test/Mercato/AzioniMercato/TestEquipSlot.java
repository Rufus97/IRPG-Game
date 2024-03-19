package Mercato.AzioniMercato;

import Player.Inventario;
import Player.Oggetto;
import Player.CharacterEquipment.CharEquip;
import Player.CharacterEquipment.InventoryNew.EquippableItems;
import Stanze.Mercato.Bancarella.BancType;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class TestEquipSlot {

    @Test
    public void testNewInventory(){
        Inventario test = Mockito.mock(Inventario.class);
        CharEquip testEquip = CharEquip.getPlayerEquipment();
        ArrayList<Oggetto> testInventory = new ArrayList<>();
        when(test.getInventario()).thenReturn(testInventory);

        testInventory.add(new Oggetto(BancType.VESTITI.getInventory().getFirst().getItemName(), 1));
        List<EquippableItems> equipment = testEqui();
        System.out.println(equipment);
        assertTrue(equipment.size() == 1);

    }
}
