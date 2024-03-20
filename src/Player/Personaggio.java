package Player;

import Main.GamePanel;
import Main.Utility.Entity;
import Main.Utility.Moves;
import Player.CharacterEquipment.CharEquip;
import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.PlayerUtils.Moves.BasicAttack;
import Player.PlayerUtils.Moves.Escape;
import Player.PlayerUtils.Moves.UseItem;
import Stanze.Ospedale;
import prompt.Prompt;

import java.util.*;

public class Personaggio implements Entity{



	private Map<Integer, Moves> playMoves = Map.of(1, BasicAttack.Ba, 2, UseItem.Uitem, 3, Escape.Esc);
	private String nome;
	private String sesso;
	private int HP = 100;

	private int armor = 0;
	private int dmg = 5;
	private double soldi = 100;
	private double karma = 0;
	private Double livelloSballo = 0D;
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

	public int getArmor() {
		return armor;
	}
	public void setArmor(){
		this.armor = CharEquip.getPlayerEquipment().getAllArmor();
	}

	public String getSesso() {
		return sesso;
	}

	public double getSoldi() {
		return Math.round(soldi * 100.0) / 100.0;
	}

	public Double getLivelloSballo() {
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
		Prompt prompt = Prompt.getPrompt();
		// se i soldi del giocatore sono uguali o maggiori del prezzo il boleano ritorna
		// vero
		if (GamePanel.giocatore.getSoldi() >= Math.abs(prezzo)) {
			GamePanel.giocatore.setSoldi(Math.round(prezzo * 100.0) / 100.0);
			checkSoldi = true;
		} else {
			prompt.choosePrompt(prompt.getPromptNoMoney());;
		}
		return checkSoldi;
	}

	public void controlloSetHP(int HPValue) {

		if (GamePanel.giocatore.getHP() + HPValue > 100) {
			HP = 100;
		}else if(GamePanel.giocatore.getHP() + HPValue <= 0) {
			this.HP = 0;
			System.out.println("sei morto " + GamePanel.giocatore.getHP());
			Ospedale HPO = new Ospedale();
			HPO.runStanza();
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
			this.livelloSballo = 1D;
		}else if(GamePanel.giocatore.getLivelloSballo() + sballoValue < -1){
			this.livelloSballo = -1D;
		}else{
			setLivelloSballo(sballoValue);
		}
	}

	//equip weapon


	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	@Override
	public int getHp() {
		return this.HP;
	}


	public int getDmg() {
		return this.dmg;
	}

	@Override
	public void entIsDmg(int dmg) {
		this.HP -= dmg;
	}

	@Override
	public Map<Integer, Moves> getMoves() {
		return this.playMoves;
	}

	@Override
	public String toString() {
		return "Player " +
				" HP: " + HP ;
	}
}
