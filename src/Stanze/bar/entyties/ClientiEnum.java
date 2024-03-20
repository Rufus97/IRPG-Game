package Stanze.bar.entyties;

import Main.Utility.Entity;
import Main.Utility.Moves;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.bar.mossa.MosseClienti;

import java.util.Map;

public enum ClientiEnum implements Entity {

    GOLLUM(10, Map.of(1, new MosseClienti(1, "basic attack"), 2, new MosseClienti(5, "my precious"))),
    SMILZO(20, Map.of(1, new MosseClienti(3, "basic attack"), 2, new MosseClienti(7, "mozzarella strike"))),
    NORMALE(30, Map.of(1, new MosseClienti(5, "basic attack"), 2, new MosseClienti(10, "backstab"))),
    PIAZZATO(40, Map.of(1, new MosseClienti(10, "basic attack"), 2, new MosseClienti(15, "mandolin combo"))),
    LEGGENDARIO(60, Map.of(1, new MosseClienti(20, "basic attack"), 2, new MosseClienti(50, "vesuvian punch")));

    private int clienteHP;
    private Map<Integer, Moves> moves;


    public int getClienteHP() {
        return clienteHP;
    }

    ClientiEnum( int clienteHP, Map<Integer, Moves> moves) {
        this.clienteHP = clienteHP;
        this.moves = moves;

    }

    public static ClientiEnum choiseCliente(){
        ClientiEnum clientiEnum = null;
        RandomDice dado = new RandomDice();
        int risultato = dado.getDado(0,ClientiEnum.values().length -1) ;
        int totaleClienti = ClientiEnum.values().length -1;

        clientiEnum = ClientiEnum.values()[totaleClienti - risultato];
        return clientiEnum;
    }


    @Override
    public int getHp() {
        return this.clienteHP;
    }


    @Override
    public void entIsDmg(int dmg) {
        this.clienteHP -= dmg;
    }

    @Override
    public Map<Integer, Moves> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return
                "cliente hp: " + clienteHP
                ;
    }
}
