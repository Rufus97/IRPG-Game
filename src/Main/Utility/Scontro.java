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

import java.util.Map;

public class Scontro {
RandomDice rng = new RandomDice();

    public boolean scontro(Entity ent1, Entity ent2){
      Map<Integer, Moves> ent1Moves = ent1.getMoves();
      Map<Integer, Moves> ent2Moves = ent2.getMoves();
      int playerArmor = CharEquip.getPlayerEquipment().getAllArmor();

      boolean isPlayerEscaped = false;

      while (GamePanel.giocatore.getHp() > 0 && ent2.getHp() > 0 && !isPlayerEscaped ){

      System.out.println("player turn, player hp: " + ent1.getHp());
      ent1Moves.forEach((k,v) ->
              System.out.println(k + ": " + v.getName()));
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
      //scelta mossa
      int rng = Casuale.numeroCasualeTra(1, ent2Moves.size());
      Moves computerChoice = ent2Moves.get(rng);

      System.out.println(ent2 + " strikes with: " + computerChoice.getName() + "!!!"
      + "\n it deals: " + computerChoice.getDmg() + " dmg \n player armor: " + playerArmor );
      //calcolo danno

      if ( computerChoice.getDmg() - playerArmor > 0){
        GamePanel.giocatore.entIsDmg(computerChoice.getDmg() - playerArmor);
          System.out.println(" player hp: " + GamePanel.giocatore.getHp());
      }

      };

      //RESULTS


        if (GamePanel.giocatore.getHp() > 0){
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
}



