package Stanze.bar;

public class Azione {
    private String nome;
    private String descrizione;
    private Double prezzo;

    public Azione(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public Azione(String nome,Double prezzo, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void run(){

    }

    @Override
    public String toString() {
        return "Azione{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
