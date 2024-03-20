package Stanze.bar.azioni;

import Input.Casuale;
import Main.GamePanel;
import Main.Utility.Entity;
import Main.Utility.Scontro;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Stanze.bar.Azione;
import Stanze.bar.entyties.Barista;
import Stanze.bar.items.oggetti.Bottiglia;
import Stanze.bar.items.oggetti.BottigliaRotta;

import java.util.*;

public class BeviUnaBirra extends Azione {

    double fixedDouble = GamePanel.giocatore.getLivelloSballo() * 10;
    private Map<Integer, Azione> azioni = new HashMap<>();
    public BeviUnaBirra(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }

    @Override
    public void run() {
        GamePanel.giocatore.mostraStatistiche();

        if(GamePanel.giocatore.controllaSoldi(-3D)) {
            GamePanel.giocatore.controlloSetHP(-2);
            GamePanel.giocatore.controlloSetSballo(0.1);
            GamePanel.giocatore.mostraStatistiche();

            if(Casuale.numeroCasualeTraDouble(0, GamePanel.giocatore.getLivelloSballo()) > 1.3){
                System.out.println("SEI TROPPO BRILLO PER CONTINUARE A BERE! Spacchi la bottiglia...");
                NewInventory.getInventory().addToBackpack(new BottigliaRotta());
                rissaConArma();
            }else{
                NewInventory.getInventory().addToBackpack(new Bottiglia());
                System.out.println("hai ottenuto un consumabile di tipo Bottiglia!");
                System.out.println("Bottiglia +1");
            }
        }
    }

    public void rissaConArma(){

        Scontro scontro = new Scontro();
        List<Entity> enemies = new ArrayList<>(Arrays.asList(new Barista()));
        GamePanel.giocatore.mostraStatistiche();
        if(scontro.scontro(enemies)){
            new RubaDallaCassa("ruba dalla cassa", "bla bla").run();
        }

        GamePanel.clearScreen();

    }
}
