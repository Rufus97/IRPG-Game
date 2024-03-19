package Player.PlayerUtils;

import Main.Utility.Moves;

public enum PlayerMoves implements Moves {


    Attack(5, "basic attack"),
    Run(0,"escape"),
    Item(0, "use an item");

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
    @Override
    public void moveEff() {

    }

}
