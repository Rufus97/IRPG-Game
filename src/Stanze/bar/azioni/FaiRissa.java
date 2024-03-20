package Stanze.bar.azioni;

import Main.GamePanel;
import Main.Utility.Entity;
import Main.Utility.Scontro;
import Stanze.bar.Azione;
import Stanze.bar.entyties.Barista;

import java.util.*;

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
        List<Entity> enemies = new ArrayList<>(Arrays.asList(new Barista()));
        scontro.scontro(enemies);
        GamePanel.giocatore.mostraStatistiche();
        if(scontro.scontro(enemies)){
            new RubaDallaCassa("ruba dalla cassa", "bla bla").run();
        }

        GamePanel.clearScreen();
    }


}
