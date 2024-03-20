package Stanze.bar;

import Input.In;
import Main.GamePanel;
import Stanze.Stanza;
import Stanze.bar.azioni.*;
import Stanze.bar.azioni.mangiaQualcosa.Mangia;
import Stanze.bar.azioni.cocktail.Cocktail;

import java.util.HashMap;
import java.util.Map;

public class Bar implements Stanza {
    private Map<Integer, Azione> azioni = new HashMap<>();

    public Bar() {
        this.azioni.put(1 , new BeviCaffe("Caffe", 1D,"blabla"));
        this.azioni.put(2 , new FaiColazione("Cappuccino e cornetto", 2D, "blabla"));
        this.azioni.put(3 , new Mangia("Mangia qualcosa", 3D, "blabla"));//cambia nome
        this.azioni.put(4 , new BeviUnaBirra("Bevi una birra", 3D, "blabla"));
        //this.azioni.put(5 , new Cocktail("Componi il tuo cocktail", 7D, "blabla"));
        this.azioni.put(5 , new CompraFumo("Compra er fumo bono der barista ", 20D, "blabla"));
        this.azioni.put(6 , new FaiRissa("Sbrocca e inizia 'na rissa cor barista", "blabla"));
        this.azioni.put(7 , new RapinaClienti("Rapina i clienti", "blabla"));
        this.azioni.put(0 , new Azione("Esci", "blabla"));
    }

    @Override
    public void runStanza() {
        int scelta;
        do {


            GamePanel.giocatore.mostraStatistiche();

            for (Map.Entry<Integer, Azione> elemento : azioni.entrySet()) {
                System.out.println(elemento.getKey() + ". " + elemento.getValue().getNome());
            }

            scelta = In.inputForMaps(azioni);
            GamePanel.clearScreen();

            this.azioni.get(scelta).run();
        }while(scelta != 0);


    }

    @Override
    public String getNomeStanza() {
        return "Bar";
    }
}
