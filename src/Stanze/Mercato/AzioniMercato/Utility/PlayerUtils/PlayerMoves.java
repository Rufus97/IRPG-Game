package Stanze.Mercato.AzioniMercato.Utility.PlayerUtils;

import Stanze.Mercato.AzioniMercato.Utility.Moves;

public enum PlayerMoves implements Moves {

    Attack(5, "basic attack");

    private int dmg;
    private String nome;

    private PlayerMoves(int dmg, String nome){
        this.dmg = dmg;
        this.nome = nome;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public int getDmg() {
        return this.dmg;
    }
}
