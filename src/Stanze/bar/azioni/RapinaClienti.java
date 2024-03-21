package Stanze.bar.azioni;

import Input.Casuale;
import Main.GamePanel;
import Main.Utility.Entity;
import Main.Utility.Scontro;
import Player.CharacterEquipment.InventoryNew.ConsumableItems;
import Player.CharacterEquipment.InventoryNew.Inventory;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.bar.Azione;
import Stanze.bar.entyties.Barista;
import Stanze.bar.entyties.ClientiEnum;
import Stanze.bar.items.ItemsBar;
import Stanze.bar.items.oggetti.Accendino;
import Stanze.bar.items.oggetti.Bottiglia;
import Stanze.bar.items.oggetti.Fumo;
import Stanze.bar.items.oggetti.OcchialiDaSole;

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
        List<Inventory> droppabili = new ArrayList<>(Arrays.asList(Accendino.accendino, Bottiglia.bottiglia, Fumo.fumo, OcchialiDaSole.occhialiDaSole));
        GamePanel.giocatore.mostraStatistiche();

        if(scontro.scontro(enemies)) {
            Inventory drop = droppabili.get(Casuale.numeroCasualeTra(0,droppabili.size()-1));
            NewInventory.getInventory().addToBackpack(drop);
            System.out.println("Hai dropparo " + drop.getName());
        }

        GamePanel.giocatore.controlloSetKarma(- 0.06);
        System.out.println("karma -" + 0.06);
        GamePanel.clearScreen();
    }
}