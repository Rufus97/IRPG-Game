package Stanze.barvecchio.alcolici;

public enum TipoAlcolico {
    VODKA("Vodka", 40),
    GIN("Gin", 47),
    RUM("Rum", 45),
    TEQUILA("Tequila", 38),
    SAMBUCA("Sambuca", 42),
    ASSENSIO("Assensio", 75),
    COGNAC("Cognac", 40),
    BRANDY("Brandy", 35),
    WHISKY("Whisky", 43);

    private String nome;
    private double gradazioneAlcolica;

    TipoAlcolico(String nome, double gradazioneAlcolica) {
        this.nome = nome;
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public String getNome() {
        return nome;
    }

    public double getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    @Override
    public String toString() {
        return "TipoAlcolico{" +
                "nome='" + nome + '\'' +
                ", gradazioneAlcolica=" + gradazioneAlcolica +
                '}';
    }
}
