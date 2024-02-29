package Player;

import Main.GamePanel;
import Stanze.Ospedale;

public class Personaggio {
	private String nome;
	private String sesso;
	private int HP = 100;
	private double soldi = 100;
	private double karma = 0;
	private double livelloSballo = 0;
	private double livelloSoddisfazione = 0;
	private int posizione = 1;

	// costruttore
	public Personaggio() {

	}

	public void mostraStatistiche() {
		System.out.println("HP: " + getHP() + "; Karma: " + getKarma() + "; Soddisfazione: " + getLivelloSoddisfazione()
				+ "; Sballo: " + getLivelloSballo() + "; Soldi: " + getSoldi());
	}

	public int getHP() {
		return HP;
	}

	public double getKarma() {
		return karma;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSesso() {
		return sesso;
	}

	public double getSoldi() {
		return Math.round(soldi * 100.0) / 100.0;
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

	public void setKarma(double karma) {
		this.karma += karma;
	}

	public void setLivelloSballo(double livelloSballo) {
		this.livelloSballo += livelloSballo;
	}

	public void setLivelloSoddisfazione(double livelloSoddisfazione) {
		this.livelloSoddisfazione += livelloSoddisfazione;
	}

	public boolean controllaSoldi(Double prezzo) {
		boolean checkSoldi = false;
		// se i soldi del giocatore sono uguali o maggiori del prezzo il boleano ritorna
		// vero
		if (GamePanel.giocatore.getSoldi() >= Math.abs(prezzo)) {
			GamePanel.giocatore.setSoldi(Math.round(prezzo * 100.0) / 100.0);
			checkSoldi = true;
		} else {
			System.out.println("NON HAI UNA LIRA");
		}
		return checkSoldi;
	}

	public void controlloSetHP(int HPValue) {

		if (GamePanel.giocatore.getHP() + HPValue > 100) {
			HP = 100;
		}else if(GamePanel.giocatore.getHP() + HPValue <= 0) {
			this.HP = 0;
			System.out.println("sei morto" + GamePanel.giocatore.getHP());
			Ospedale.HP0();
		} else {
			setHP(HPValue);
		}
	}
	public void controlloSetKarma(double karmaValue){

		if(GamePanel.giocatore.getKarma() + karmaValue >= 1){
			this.karma = 1;
		}else if(GamePanel.giocatore.getKarma() + karmaValue < -1){
			this.karma = -1;
		}else{
			setKarma(karmaValue);
		}
	}

	public void controlloSetSoddisfazione(double soddisfazioneValue){

		if(GamePanel.giocatore.getLivelloSoddisfazione() + soddisfazioneValue >= 1){
			this.livelloSoddisfazione = 1;
		}else if(GamePanel.giocatore.getLivelloSoddisfazione() + soddisfazioneValue < -1){
			this.livelloSoddisfazione = -1;
		}else{
			setLivelloSoddisfazione(soddisfazioneValue);
		}
	}

	public void controlloSetSballo(double sballoValue){

		if(GamePanel.giocatore.getLivelloSballo() + sballoValue >= 1){
			this.livelloSballo = 1;
		}else if(GamePanel.giocatore.getLivelloSballo() + sballoValue < 0){
			this.livelloSballo = 0;
		}else{
			setLivelloSballo(sballoValue);
		}
	}

	
}
