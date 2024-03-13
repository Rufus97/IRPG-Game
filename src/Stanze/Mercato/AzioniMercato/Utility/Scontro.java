package Stanze.Mercato.AzioniMercato.Utility;

import Input.Casuale;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.Mercato.AzioniMercato.Utility.PlayerUtils.PlayerMoves;
import Stanze.Mercato.Mercato;
import Stanze.Mercato.MercatoInputs;

import java.util.List;

public class Scontro {
RandomDice rng = new RandomDice();

    public boolean scontro(Entity ent1, Entity ent2){
        boolean winScon = false;
        int hp1 = ent1.getHp();
        List<Moves> ent2Moves = ent2.getMoves();
        int hp2 = ent2.getHp();
        System.out.println(ent2 + " " + ent2.getDmg());
        MercatoInputs input = new MercatoInputs();

        System.out.println(ent1 + " is fighting " + ent2);
        do {
            int choice = 0;
            System.out.println(ent1 + " turn");
            for (Moves move : ent1.getMoves()){
                System.out.println(move.getName() + " dmg: " + move.getDmg());
            }

            choice = input.getInt();
            switch (choice){
                case 1: hp2 -= PlayerMoves.values()[choice-1].getDmg();
                System.out.println("enemy has " + hp2);
            }
            System.out.println(ent2 + " turn");
            Moves chosedMove = ent2Moves.get(Casuale.numeroCasualeTra(0, ent2Moves.size()-1));
            hp1 -= chosedMove.getDmg();
            System.out.println(ent2 + " strike with: " + chosedMove.getName());
            System.out.println(ent1 + " get: " + ent2.getDmg() + " damage");
            System.out.println(ent1 + " has: " + hp1);

        } while (hp1 > 0 && hp2 > 0);
        if (hp1 > 0){
            System.out.println("you won");
            winScon = true;
        } else {
            System.out.println("you've been defeated ");
            winScon = false;
        }
        return winScon;
    }

}
