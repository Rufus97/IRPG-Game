package Stanze.puntoSnai.Cavalli;

import Input.Casuale;
import Main.GamePanel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cavallo implements Corsa{

    private double stamina;
    private double velocità;
    private String nome;
    private List<Character> percorso = new ArrayList<Character>(Arrays.asList('A','-','-','-','-','-','-','-','-','-'));

    public Cavallo(String nome){
        this.nome = nome;
        this.velocità = Casuale.numeroCasualeTra(1,3);
        this.stamina = 8;
    }

    public String getNome() {
        return nome;
    }

    public List<Character> getPercorso() {
        return percorso;
    }

    @Override
    public void movimentoCavallo() {

        int firstIndex = this.percorso.indexOf('A');
            if(firstIndex + this.velocità > this.percorso.size()-1){
                Collections.swap(this.percorso,firstIndex,firstIndex + 1);
                System.out.println(percorso);
            }
            else{
            Collections.swap(this.percorso,firstIndex,firstIndex + (int)this.velocità);
            System.out.println(percorso);
            // se si pulisse lo schermo ad ogni stampa sarebbe bello
            }
    }



    // ancora da concepire
    @Override
    public boolean stancaCavallo(double velocita) {
        boolean isItTired = false;
        double tiredNess =+ this.stamina - velocita;

        if (tiredNess == 0){
            isItTired = true;
        }
        return isItTired;
    }
}
