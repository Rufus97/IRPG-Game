package Stanze.bar.azioni;

import Input.In;
import Main.GamePanel;
import Player.Oggetto;
import Stanze.bar.Azione;

import java.util.HashMap;
import java.util.Map;

public class BeviUnaBirra extends Azione {

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

            if(GamePanel.giocatore.getLivelloSballo() >= 0.5){
                rissaConArma();
            }else{
                Oggetto bottiglia = new Oggetto("bottiglia", 1);
                GamePanel.inventario.aggiungiItem(bottiglia);
                System.out.println("hai ottenuto un'arma di tipo Bottiglia!");
                System.out.println("Bottiglia +1");
            }
        }
    }

    public void rissaConArma(){
        int scelta;

        System.out.println("SEI TROPPO BRILLO PER CONTINUARE A BERE! Spacchi la bottiglia e minacci il barista...");
        GamePanel.giocatore.controlloSetSoddisfazione(6);
        GamePanel.giocatore.mostraStatistiche();


        scelta = In.inputInt();
        GamePanel.clearScreen();

    }
}
