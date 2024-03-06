package Stanze.bar.azioni;

import Main.GamePanel;
import Stanze.bar.Azione;
import org.w3c.dom.ls.LSOutput;

public class BeviCaffe extends Azione {
    public BeviCaffe(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public BeviCaffe(String nome, Double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }

    public void run() {

        if (GamePanel.giocatore.controllaSoldi(-1D)) {
            GamePanel.giocatore.controlloSetHP(2);
            System.out.println("Hai bevuto un caffè");
        }
    }
}
