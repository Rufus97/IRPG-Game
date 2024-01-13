package Stanze;
import Input.Casuale;
// Work in progress
class Stanza {
    private String nome;
    private String descrizione;

    public Stanza(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void eseguiAzione() {
        // Azione di default per la stanza
        System.out.println("Nessuna azione particolare in questa stanza.");
    }
}
