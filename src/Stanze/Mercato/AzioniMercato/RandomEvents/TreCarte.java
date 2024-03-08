package Stanze.Mercato.AzioniMercato.RandomEvents;

import Main.GamePanel;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.Mercato.MercatoInputs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TreCarte{

    public String nome;
    public Map<Integer, String> carte = Map.of(1, "carta 1", 2, "carta 2", 3, "carta 3");

    private MercatoInputs treCarteInput = new MercatoInputs();



    public void runAction(Object userInput) {
        chooseACard(treCarteInput);
    }
    public List<String> getCartaVincente(){
        RandomDice dice = new RandomDice();
        List<String> carteVincenti = new ArrayList<>();
        for (int i = 1; i <= dice.getDado(1,3); i++){
            carteVincenti.add(this.carte.get(i));
        }
        return carteVincenti;
    }
    public void chooseACard(MercatoInputs userInput){
        System.out.println("scegli una carta ");
        this.carte.forEach((k,v) -> System.out.println(k + ": " + v));
        int userChoice = userInput.getInt();

        if (userChoice >= 1 && userChoice <= this.carte.size()){
            if (getCartaVincente().contains(this.carte.get(userChoice))){
                System.out.println("ma come è possibile... ha vinto...");
                GamePanel.giocatore.setSoldi(20.0);
                System.out.println(GamePanel.giocatore.getSoldi());

            } else {
                System.out.println("aaah ma che zella, c'eri quasi!");
                if (GamePanel.giocatore.controllaSoldi(-20.0)){
                    System.out.println(GamePanel.giocatore.getSoldi());
                } else {
                    System.out.println("ah si non hai 20 euro? PAGHERAI CON LA VITA!!!" +
                             "\n il buon mercante ti accoltella con la sua daga, i 20 euro li hai pagati in hp");
                    GamePanel.giocatore.controlloSetHP(-20);
                    GamePanel.giocatore.mostraStatistiche();
                }


            }
        } else {
            chooseACard(userInput);
        }

    }
}
