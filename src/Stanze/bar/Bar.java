package Stanze.bar;

import Input.In;
import Main.GamePanel;
import Stanze.bar.azioni.*;
import Stanze.bar.azioni.Mangia.Mangia;

import java.util.HashMap;
import java.util.Map;

public class Bar {
    private Map<Integer, Azione> azioni = new HashMap<>();

    public Bar() {
        this.azioni.put(1 , new BeviCaffe("Caffe", 1D,"blabla"));
        this.azioni.put(2 , new FaiColazione("Cappuccino e cornetto", 2D, "blabla"));
        this.azioni.put(3 , new Mangia("Mangia", 3D, "blabla"));//sistemare nome
        this.azioni.put(4 , new BeviUnaBirra("Tramezzino", 3D, "blabla"));
        this.azioni.put(6 , new CompraFumo("Er fumo bono der barista ", 20D, "blabla"));
        this.azioni.put(7 , new FaiRissa("Sbrocca e inizia 'na rissa cor barista", "blabla"));
        this.azioni.put(0 , new Azione("Esci", "blabla"));
    }

    public void runBar(){
    
        int scelta;
       
        do {GamePanel.giocatore.mostraStatistiche();

            for(Map.Entry<Integer, Azione> elemento : azioni.entrySet()){
                System.out.println(elemento.getKey() + ". " + elemento.getValue().getNome());
            }

            scelta = In.inputInt();
            GamePanel.clearScreen();

            this.azioni.get(scelta).run();

        } while (scelta!=0);

    }


    
}
