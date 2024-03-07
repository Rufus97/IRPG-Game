package Stanze.Mercato.AzioniMercato.SubAzioni;

public enum NapoliEnum {
    GOLLUM(1,10),
    SMILZO(3,20),
    NORMALE(5,30),
    PIAZZATO(10,40),
    LEGGENDARIO(20,60);
    private int napoleanDamage;
    private int napoleanHp;

    @Override
    public String toString() {
        return
                "napoleanDamage=" + napoleanDamage +
                ", napoleanHp=" + napoleanHp +
                '}';
    }

    public int getNapoleanDamage() {
        return napoleanDamage;
    }

    public int getNapoleanHp() {
        return napoleanHp;
    }

    NapoliEnum(int napoleanDamage, int napoleanHp) {
        this.napoleanDamage = napoleanDamage;
        this.napoleanHp = napoleanHp;
    }


}
