package Stanze.bar.azioni;

import Main.GamePanel;
import Main.Utility.Entity;
import Main.Utility.Scontro;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.bar.Azione;
import Stanze.bar.entyties.Barista;
import Stanze.bar.entyties.ClientiEnum;

import java.util.*;

public class RapinaClienti extends Azione {
    private Map<Integer, Azione> azioni = new HashMap<>();
    public RapinaClienti(String nome, String descrizione) {
        super(nome, descrizione);

        this.azioni.put(1 , new RubaDallaCassa("Ruba dalla cassa","blabla"));
        this.azioni.put(0 , new Azione("Esci", "blabla"));
    }
    @Override
    public void run() {

        Scontro scontro = new Scontro();

        List<Entity> enemies = new ArrayList<>(Arrays.asList(ClientiEnum.choiseCliente(), ClientiEnum.choiseCliente()));
        scontro.scontro(enemies);

        GamePanel.giocatore.mostraStatistiche();


        GamePanel.clearScreen();
    }
}
