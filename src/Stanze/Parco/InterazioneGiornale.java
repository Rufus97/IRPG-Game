package Stanze;

import Player.Personaggio;

public class InterazioneGiornale {

    public static void leggiIlGiornale(Personaggio personaggio) {
        System.out.println("Leggi il giornale sulla panchina...");
        System.out.println("Le notizie del giorno ti informano su vari eventi in città.");

        // Aumenta gli HP ma cala la soddisfazione
        int bonusHP = 5.0;
        double malusSoddisfazione = 5.0;

        personaggio.setHP(bonusHP);
        personaggio.setLivelloSoddisfazione(personaggio.getLivelloSoddisfazione() - malusSoddisfazione);

        System.out.println("Leggere il giornale ti ha fa riprendere fiato, ma dopo poco ti annoi, torniamo in azione! HP + " + bonusHP + ", Soddisfazione - " + malusSoddisfazione);
    }
}
