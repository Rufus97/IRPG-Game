import Input.In;

class Personaggio {
    private String nome;
    private String sesso;
    private int HP;
    private double soldi;
    private int karma;
    private double livelloSballo;
    private double livelloSoddisfazione;
    private int posizione;

    public Personaggio() {
        //Creazione personaggio
        System.out.print("Inserisci il nome del tuo personaggio: ");
        this.nome = In.scanner.nextLine();
        this.posizione = 0;
    }

    public static void creazionePersonaggio() {
        Personaggio personaggio = new Personaggio();

    }

    public int getPosizione() {
        return this.posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }
}
