package Stanze.bar.azioni.Mangia;

public enum Cibo {
    CORNETTO("Cornetto", 1.20),
    CIAMBELLONE("Fetta di ciambellone", 1.50),
    CROSTATINA("Crostata", 2D),
    CHEESECAKE("Fetta di cheesecake", 3D),
    MUFFIN("Muffin", 2.50),
    COOCKIE("Coockie", 1.50),
    TRAMEZZINO("Tramezzino", 1.80),
    PANINO("Panino", 2.50),
    PIZZETTA("Pizzetta", 2.50);

    private String nome;
    private Double prezzo;
    private Cibo(String nome, Double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Cibo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
