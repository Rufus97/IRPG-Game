package Player;

import Main.GamePanel;

public class Personaggio {
    private String nome;
     private String sesso;
     private int HP = 100;
     private double soldi = 50;
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

    public boolean controllaSoldi(Double Prezzo){
    	boolean checkSoldi = false;
        //se i soldi del giocatore sono uguali o maggiori del prezzo il boleano ritorna vero
        if(GamePanel.giocatore.getSoldi() >= Math.abs(Prezzo)){
        	GamePanel.giocatore.setSoldi(Prezzo);
        	checkSoldi = true;}
        else {System.out.println("NON HAI UNA LIRA");}
        return checkSoldi;
    }

   
    public void controllaHP(int HPValue){

        if(GamePanel.giocatore.getHP() + HPValue <= 0) {
        	GamePanel.giocatore.setHP(HPValue);
        	System.out.println("sei morto" + GamePanel.giocatore.getHP());
        }else if(GamePanel.giocatore.getHP() + HPValue > 100){
        	HP = 100;
        }else {GamePanel.giocatore.setHP(HPValue); }
    }
}
