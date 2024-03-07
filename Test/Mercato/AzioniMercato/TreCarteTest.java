package Mercato.AzioniMercato;

import Input.In;
import Main.GamePanel;
import Stanze.Mercato.AzioniMercato.SubAzioni.TreCarte;
import Stanze.Mercato.Mercato;
import Stanze.Mercato.MercatoInputs;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class TreCarteTest {

    @Test
    public void testWinGame(){
        TreCarte test = new TreCarte();
        MercatoInputs inputTest = Mockito.mock(MercatoInputs.class);
        when(inputTest.getInt()).thenReturn(1);

        test.chooseACard(inputTest);
        Assert.assertEquals(120, GamePanel.giocatore.getSoldi(), 0);

    }
    // c'è una chance che escano le carte contenute nella lista, lanciare il test più volte
    @Test
    public void cardsAreRandom(){
        List<String> notRandomCards = new ArrayList<>(Arrays.asList(
                "carta 1", "carta 2", "carta 3"
        ));
        TreCarte test = new TreCarte();
        Assert.assertFalse(notRandomCards.equals(test.getCartaVincente()));
    }


}
