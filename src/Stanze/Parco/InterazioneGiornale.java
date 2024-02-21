package Stanze.Parco;

import Main.GamePanel;
import Player.Personaggio;

public class InterazioneGiornale {

    public static void leggiIlGiornale((GamePanel.giocatore) {
        System.out.println("Leggi il giornale sulla panchina...");
        System.out.println("Le notizie del giorno ti informano su vari eventi in città.");

        // Aumenta gli HP ma cala la soddisfazione
        GamePanel.giocatore.setHP(10);
        GamePanel.giocatore.setLivelloSoddisfazione(-10);
        GamePanel.giocatore.setLivelloSoddisfazione(-10);


        System.out.println("Leggere il giornale ti ha fa riprendere fiato, ma dopo poco ti annoi, torniamo in azione! HP + ");
    }
}
