package Stanze.bar.azioni;

import Main.GamePanel;
import Player.Oggetto;
import Stanze.Questura;
import Stanze.bar.Azione;

public class CompraFumo extends Azione {
    public CompraFumo(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }

    @Override
    public void run() {
        Oggetto fumo = new Oggetto("fumo",1);
        if(GamePanel.giocatore.getKarma() >= 0){

            if (GamePanel.giocatore.controllaSoldi(-20D)) {
                GamePanel.giocatore.setSoldi(-20D);
                GamePanel.inventario.aggiungiItem(fumo);
                System.out.println("SENTI CHE SMELLA STO FUMO!");
            }
        }
        else{
            if (GamePanel.giocatore.controllaSoldi(-20D)) {
                GamePanel.giocatore.setSoldi(-20D);
                GamePanel.inventario.aggiungiItem(fumo);
                System.out.println("SENTI CHE SMELLA STO FUMO!");
            }

            System.out.println("Entrano i CARRAMBA! Cerchi di nascondere il pacchetto nei pantaloni, ma non fai in tempo. La guardia ti afferra il braccio e ti carica in macchina");
            Questura.runQuestura();
        }
    }
}
