package Personaggio;

import Input.In;

public class Personaggio {
     private String nome;
     private String sesso;
     private int HP = 100;
     private double soldi = 50;
     private int karma = 50;
     private double livelloSballo = 0;
     private double livelloSoddisfazione = 0;
     private int posizione = 0;

    public Personaggio(String nome, String sesso) {
        //Creazione personaggio
        System.out.print("Inserisci il nome del tuo personaggio: ");
        this.nome = In.scanner.nextLine();
        this.sesso = In.scanner.nextLine(); //da vedere come limitare
    }

    public int getHP() {
        return HP;
    }
    public int getKarma() {
        return karma;
    }
    public String getNome() {
        return nome;
    }
    public String getSesso() {
        return sesso;
    }
    public double getSoldi() {
        return soldi;
    }
    public double getLivelloSballo() {
        return livelloSballo;
    }
    public double getLivelloSoddisfazione() {
        return livelloSoddisfazione;
    }
    public int getPosizione() {
        return this.posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public void setSoldi(double soldi) {
        this.soldi = soldi;
    }
    public void setKarma(int karma) {
        this.karma = karma;
    }
    public void setLivelloSballo(double livelloSballo) {
        this.livelloSballo = livelloSballo;
    }
    public void setLivelloSoddisfazione(double livelloSoddisfazione) {
        this.livelloSoddisfazione = livelloSoddisfazione;
    }
}