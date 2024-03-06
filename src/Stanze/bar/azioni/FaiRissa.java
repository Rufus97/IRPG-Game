package Stanze.bar.azioni;

import Input.Casuale;
import Input.In;
import Main.GamePanel;
import Stanze.bar.Azione;

import java.util.HashMap;
import java.util.Map;

public class FaiRissa extends Azione {
    private Map<Integer, Azione> azioni = new HashMap<>();
    public FaiRissa(String nome, String descrizione) {
        super(nome, descrizione);

        this.azioni.put(1 , new RubaDallaCassa("Ruba dalla cassa","blabla"));
        this.azioni.put(0 , new Azione("Esci", "blabla"));
    }
    @Override
    public void run() {
        int scelta;

        if(GamePanel.giocatore.getLivelloSballo() <= 0) {

            System.out.println("Sferri due colpi al barista e lo metti KO");
            System.out.println("L'HAI FATTO NERO! Cosa vuoi fare?");
            GamePanel.giocatore.controlloSetSoddisfazione(6);
            GamePanel.giocatore.controlloSetKarma(-0.2);
            GamePanel.giocatore.mostraStatistiche();

            scelta = In.inputInt();
            GamePanel.clearScreen();

            for(Map.Entry <Integer, Azione> elemento : azioni.entrySet()){
                System.out.println(elemento.getKey() + ". " + elemento.getValue().getNome());
            }

            this.azioni.get(scelta).run();

        } else {
            System.out.println("Ce l'hai prese");
            GamePanel.giocatore.mostraStatistiche();
        }
    }


}
