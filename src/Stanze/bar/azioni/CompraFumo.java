package Stanze.bar.azioni;

import Main.GamePanel;
import Main.Utility.Entity;
import Main.Utility.Scontro;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.Oggetto;
import Stanze.Parco.BruEntity.Guards.InfamousGuards;
import Stanze.Questura;
import Stanze.bar.Azione;
import Stanze.bar.items.oggetti.Fumo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompraFumo extends Azione {
    public CompraFumo(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
    }

    @Override
    public void run() {

        if(super.rng.getDado(1,20) > 10){

            if (GamePanel.giocatore.controllaSoldi(-20D)) {
                GamePanel.giocatore.setSoldi(-20D);
                NewInventory.getInventory().addToBackpack(new Fumo());
                System.out.println("SENTI CHE SMELLA STO FUMO!");
            }
        }
        else{

            System.out.println("Entrano i CARRAMBA! Cerchi di nascondere il pacchetto nei pantaloni, ma non fai in tempo. La guardia ti afferra il braccio e ti carica in macchina");
            Scontro scontro = new Scontro();
            List<Entity> caramba = new ArrayList<>(Arrays.asList(new InfamousGuards(),new InfamousGuards(), new InfamousGuards()));
            if(!scontro.scontro(caramba)){
                new Questura().runStanza();
            }
            NewInventory.getInventory().addToBackpack(new Fumo());
        }
    }
}
