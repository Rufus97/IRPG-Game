package Stanze.Tabacchino.itemsTabacchino;

public class ItemsTabacchino {

    private String nome;
    private int quantita;

    public ItemsTabacchino(String nome, int quantita) {
        this.nome = nome;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantita() {
        return quantita;
    }
}
