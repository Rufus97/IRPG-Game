package Stanze.Tabacchino;

import java.util.HashMap;
import java.util.Map;

import Input.In;
import Main.GamePanel;
import Stanze.Stanza;

public class Tabacchino implements Stanza {

    Map<Integer, Itabacchino> methodMap = new HashMap<>();

    public Tabacchino(){
        
    }

    public void runStanza(){

        int scelta;
        methodMap.put(1, new DiecieLotto());
        methodMap.put(2, new SetteMezzo());
        methodMap.put(3, new Sigarette());


        System.out.println("I tuoi Soldi " + GamePanel.giocatore.getSoldi());
        System.out.println("Sei nel Tabacchino, Cosa vuoi fare?");
        System.out.println("1. Gioca a 10eLotto");
        System.out.println("2. Gioca al 7 e Mezzo 1E");
        System.out.println("3. Compra Sigarette");
        System.out.println("0. Esci");

        scelta = In.inputForMaps(methodMap);
        GamePanel.clearScreen();

        if(scelta != 0){
            
            methodMap.get(scelta).run();
        }
       
    }

    @Override
    public String getNomeStanza() {
        return "Tabacchino";
    }

}
