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

    public boolean scontro(Entity ent2){
      Map<Integer, Moves> ent1Moves = GamePanel.giocatore.getMoves();
      List<Entity> enemies = new ArrayList<>(Arrays.asList(ent2));
      int playerArmor = CharEquip.getPlayerEquipment().getAllArmor();
      boolean isPlayerEscaped = false;

      while (GamePanel.giocatore.getHp() > 0 && ent2.getHp() > 0 && !isPlayerEscaped ){

      showALlPlayMoves(ent1Moves);
      Moves chosedMove = ent1Moves.get(In.inputInt());
          if (chosedMove instanceof Escape){
              isPlayerEscaped = ((Escape) chosedMove).escapeEff();
          }
          else if (chosedMove.getDmg() <= 0){
              chosedMove.moveEff();
          } else {
              System.out.println("you hit for: " + chosedMove.getDmg());
              ent2.entIsDmg(chosedMove.getDmg());
          }

      //scelta mossa avversario
          enemiesTurn(enemies, playerArmor);
      };

      //RESULTS


        if (GamePanel.giocatore.getHp() > 0 && !isPlayerEscaped){
            return true;
        } else if (isPlayerEscaped){
            System.out.println("sei riuscito a fuggire");
            return false;
        }
        System.out.println("sei stato sconfittolo");
        Ospedale bimbo = new Ospedale();
        bimbo.runStanza();
        return false;
    }

    public void showALlPlayMoves(Map<Integer, Moves> ent1Moves){
        System.out.println("player turn, player hp: " + GamePanel.giocatore.getHp());
        ent1Moves.forEach((k,v) ->
                System.out.println(k + ": " + v.getName()));
    }
    public void enemiesTurn(List<Entity> enemies, int playerArmor){
        List<Entity> updatedEnemies = enemies;
        for (Entity enemy : updatedEnemies){
            int rng = Casuale.numeroCasualeTra(1, enemy.getMoves().size());
            Moves computerChoice = enemy.getMoves().get(rng);
            if (computerChoice.getDmg() > 0){
                System.out.println(enemy + " strikes with: " + computerChoice.getName() + "!!!"
                        + "\n it deals: " + computerChoice.getDmg() + " player armor: " + playerArmor);
                if ( computerChoice.getDmg() - playerArmor > 0){
                    GamePanel.giocatore.entIsDmg(computerChoice.getDmg() - playerArmor);
                    System.out.println(" player hp: " + GamePanel.giocatore.getHp());
                }
            }

            }
        }
    }




