package Stanze.bar.azioni;

import Main.GamePanel;
import Main.Utility.Scontro;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.bar.Azione;
import Stanze.bar.entyties.Barista;
import Stanze.bar.entyties.ClientiEnum;

import java.util.HashMap;
import java.util.Map;

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
        scontro.scontro(ClientiEnum.choiseCliente());
        GamePanel.giocatore.mostraStatistiche();
        if(scontro.scontro(ClientiEnum.choiseCliente())){

        }

        GamePanel.clearScreen();
    }
}
