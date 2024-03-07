package Stanze.bar.azioni.mangiaQualcosa;

import Input.Casuale;
import Input.In;
import Main.GamePanel;
import Stanze.bar.Azione;

import java.util.HashMap;
import java.util.Map;


public class Mangia extends Azione {

    Map<Integer, Cibo> cibi = new HashMap<>();
    public Mangia(String nome, double prezzo, String descrizione) {
        super(nome, prezzo, descrizione);
        creaCibi();
    }



    @Override
    public void run() {

        cibi.forEach((k,v) -> System.out.println(k + ". " + v));
        int scelta;


            System.out.println("0. Esci");
            try{
                scelta = In.inputForMaps(cibi);

                double prezzo = this.cibi.get(scelta).getPrezzo();
                if(GamePanel.giocatore.controllaSoldi(-prezzo)){

                }
            }catch (NullPointerException e){

            }


    }

    public void creaCibi(){

        Integer rng = Casuale.numeroCasualeTra(0,Cibo.values().length-1);

        for(int i = 0; i <= rng; i++){
            Integer rng2 = Casuale.numeroCasualeTra(0, Cibo.values().length-1);
            if(!cibi.containsValue(Cibo.values()[rng2])){
                cibi.put(i+1, Cibo.values()[rng2]);
            }
        }

    }

    /*int index= 1;

        for(Cibo element : Cibo.values()){
            this.cibi.put(index, element);
            index++;
        }*/

}
