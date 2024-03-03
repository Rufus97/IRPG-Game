package Mercato.Logic;

import Main.GamePanel;
import Player.Personaggio;
import Stanze.Mercato.Bancarella.BancItem;
import Stanze.Mercato.Bancarella.BancType;
import Stanze.Mercato.Logic.Market;
import Stanze.Mercato.Mercato;
import Stanze.Mercato.MercatoInputs;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class MarketTest {




    @Test
    public void bancTypeWorks(){
       List<List<BancItem>> allBancTypes = new ArrayList<>();
       for (BancType type : BancType.values()){
           allBancTypes.add(type.getInventory());
       }
       assertTrue(allBancTypes.contains(BancType.PESCE.getInventory()));
       assertTrue(allBancTypes.getFirst().contains(BancType.PESCE.getInventory().getFirst()));
    }

    @Test
    public void marketInventoryIsFilled(){
        Market newMarket = new Market();
        assertTrue(newMarket.getMapOfBancs().containsValue(BancType.PESCE.getInventory()));
    }

    @Test
    public void bancInventoryIsRandomized(){
        List<BancItem> notRandomList = BancType.PESCE.getInventory();

        Market newMarket = new Market();
        assertFalse(newMarket.getOneRandomInventory(1).equals(notRandomList));
    }

    @Test
    public void testCalculatePrice(){
        MercatoInputs input = Mockito.mock(MercatoInputs.class);
        BancItem newMarket = BancType.PESCE.getInventory().getFirst();
        when(input.getInt()).thenReturn(100);

        Mercato newMercato = new Mercato("newMarket");
        newMercato.calculatePrice(newMarket, input);

        assertEquals(98.2, GamePanel.giocatore.getSoldi(), 1);
    }
    @Test
    public void shoppingTest(){
        MercatoInputs input = Mockito.mock(MercatoInputs.class);
        Market newMarket = Mockito.mock(Market.class);

        List<BancItem> testList = BancType.PESCE.getInventory();
        when(newMarket.getOneRandomInventory(1)).thenReturn(testList);
        when(input.getInt()).thenReturn(1);

        Mercato newMercato = new Mercato("newMarket");
        BancItem test = newMercato.shopping(newMarket, input.getInt());
        assertEquals("aringa", test.getItemName());
    }
}
