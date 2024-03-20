package Stanze.bar.azioni;

import Input.Casuale;
import Input.In;
import Main.GamePanel;
import Main.Utility.Scontro;
import Stanze.bar.Azione;
import Stanze.bar.azioni.entyties.Barista;

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
        Scontro scontro = new Scontro();
        scontro.scontro(GamePanel.giocatore, new Barista());
        GamePanel.giocatore.mostraStatistiche();
        if(scontro.scontro(GamePanel.giocatore, new Barista())){
            new RubaDallaCassa("ruba dalla cassa", "bla bla").run();
        }

        GamePanel.clearScreen();
    }


}
