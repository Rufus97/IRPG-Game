package Player;

import Main.GamePanel;
import Stanze.Ospedale;

public class Personaggio {
    private String nome;
     private String sesso;
     private int HP = 50;
     private double soldi = 100;
     private int karma = 50;
     private double livelloSballo = 0;
     private double livelloSoddisfazione = 0;
     private int posizione = 1;
     
    //costruttore
    public Personaggio() {
       
    }

    public void MostraStatistiche(){
        System.out.println(getHP() + getKarma() + getLivelloSoddisfazione() + getLivelloSballo() + getSoldi());
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
        return Math.round(soldi * 100.0) / 100.0 ;
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
        this.HP += HP;
    }
    public void setSoldi(Double soldi) {
        this.soldi += soldi;
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

    public boolean controllaSoldi(Double prezzo){
    	boolean checkSoldi = false;
        //se i soldi del giocatore sono uguali o maggiori del prezzo il boleano ritorna vero
        if(GamePanel.giocatore.getSoldi() >= Math.abs(prezzo)){
        	GamePanel.giocatore.setSoldi(Math.round(prezzo * 100.0) / 100.0);
        	checkSoldi = true;}
        else {System.out.println("NON HAI UNA LIRA");}
        return checkSoldi;
    }

   
    public void controllaHP(int HPValue){

        if(GamePanel.giocatore.getHP() + HPValue <= 0) {
        	GamePanel.giocatore.setHP(HPValue);
        	System.out.println("sei morto" + GamePanel.giocatore.getHP());
            Ospedale.HP0();
        }else if(GamePanel.giocatore.getHP() + HPValue > 100){
        	HP = 100;
        }else {GamePanel.giocatore.setHP(HPValue); }
    }
}
