package Stanze.puntoSnai.cavalli;
import Input.Casuale;

public class Cavallo {
	private double tempoArrivo;
	private String nome;
	private int skill;
	private StringBuilder distanza;

	public Cavallo(String nome) {
		this.tempoArrivo = Casuale.numeroCasualeTra(1, 100);
		this.nome = nome;
		this.skill = Casuale.numeroCasualeInt();
		this.distanza = new StringBuilder("□".repeat(50));
	}

	public double getTempoArrivo() {
		return tempoArrivo;
	}

	public void setTempoArrivo(double tempoArrivo) {
		this.tempoArrivo = tempoArrivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public StringBuilder getDistanza() {
		return distanza;
	}

	public void setDistanza(StringBuilder distanza) {
		this.distanza = distanza;
	}

	@Override
	public String toString() {
		return nome + " " + distanza + distanza;
	}

}
