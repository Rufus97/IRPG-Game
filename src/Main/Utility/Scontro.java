package Main.Utility;

import Input.Casuale;
import Input.In;
import Main.GamePanel;
import Player.CharacterEquipment.CharEquip;
import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.PlayerUtils.Moves.Escape;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Stanze.Ospedale;

import java.util.*;

public class Scontro {
    RandomDice rng = new RandomDice();

    public boolean scontro(List<Entity> ent2) {
        Map<Integer, Moves> ent1Moves = GamePanel.giocatore.getMoves();
        List<Entity> enemies = ent2;

        int playerArmor = CharEquip.getPlayerEquipment().getAllArmor();
        boolean isPlayerEscaped = false;
        boolean enemiesAreAlive = true;
        if (enemies.isEmpty()) {
            enemiesAreAlive = false;
        }

        while (GamePanel.giocatore.getHp() > 0 && enemiesAreAlive  && !isPlayerEscaped) {

            showALlPlayMoves(ent1Moves);
            Moves chosedMove = ent1Moves.get(In.inputInt());
            System.out.println("chose target: ");
            System.out.println(enemies);
            Entity chosedTarget = ent2.get(In.inputInt()-1);
            if (chosedMove instanceof Escape) {
                isPlayerEscaped = ((Escape) chosedMove).escapeEff();
            } else if (chosedMove.getDmg() <= 0) {
                chosedMove.moveEff();
            } else {
                System.out.println("you hit for: " + chosedMove.getDmg());
                chosedTarget.entIsDmg(chosedMove.getDmg());
            }

            //scelta mossa avversario
            List<Entity> newEnemiesContains = enemiesTurn(enemies, playerArmor);

            enemies = newEnemiesContains;
        }
        ;

        //RESULTS


        if (GamePanel.giocatore.getHp() > 0 && !isPlayerEscaped) {
            return true;
        } else if (isPlayerEscaped) {
            System.out.println("sei riuscito a fuggire");
            return false;
        }
        System.out.println("sei stato sconfittolo");
        Ospedale bimbo = new Ospedale();
        bimbo.runStanza();
        return false;
    }

    public void showALlPlayMoves(Map<Integer, Moves> ent1Moves) {
        System.out.println("player turn, player hp: " + GamePanel.giocatore.getHp());
        ent1Moves.forEach((k, v) ->
                System.out.println(k + ": " + v.getName()));
    }

    public List<Entity> enemiesTurn(List<Entity> enemies, int playerArmor) {
        List<Entity> updatedEnemies = enemies;
        int cycles = updatedEnemies.size();


        for (int i = 0; i < cycles; i++) {
                int rng = Casuale.numeroCasualeTra(1, updatedEnemies.get(i).getMoves().size());
                Moves computerChoice = updatedEnemies.get(i).getMoves().get(rng);
            if (computerChoice instanceof SummonerMove) {
                updatedEnemies.addAll(((SummonerMove) computerChoice).summon());
                System.out.println(computerChoice.getName());
            } else if (computerChoice.getDmg() > 0) {
                System.out.println(updatedEnemies.get(i) + " strikes with: " + computerChoice.getName() + "!!!"
                        + "\n it deals: " + computerChoice.getDmg() + " player armor: " + playerArmor);
                if (computerChoice.getDmg() - playerArmor > 0) {
                    GamePanel.giocatore.entIsDmg(computerChoice.getDmg() - playerArmor);
                    System.out.println(" player hp: " + GamePanel.giocatore.getHp());
                }
            }
        }
        return updatedEnemies;
    }
}



