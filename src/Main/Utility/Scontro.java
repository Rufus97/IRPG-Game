package Main.Utility;

import Input.Casuale;
import Input.In;
import Player.CharacterEquipment.CharEquip;
import Player.CharacterEquipment.EquipSlot;
import Player.CharacterEquipment.InventoryNew.NewInventory;
import Player.PlayerUtils.Moves.Escape;
import Stanze.Mercato.AzioniMercato.RandomDice;

import java.util.Map;

public class Scontro {
RandomDice rng = new RandomDice();

    public boolean scontro(Entity ent1, Entity ent2){
      Map<Integer, Moves> ent1Moves = ent1.getMoves();
      Map<Integer, Moves> ent2Moves = ent2.getMoves();
      int playerArmor = CharEquip.getPlayerEquipment().getAllArmor();
      boolean isPlayerEscaped = false;
      do{

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
              ent2.entIsDmg(chosedMove.getDmg());
          }
      //scelta mossa
      int rng = Casuale.numeroCasualeTra(1, ent2Moves.size());
      Moves computerChoice = ent2Moves.get(rng);

      System.out.println(ent2 + " strikes with: " + computerChoice.getName() + "!!!"
      + "\n it deals: " + computerChoice.getDmg() + " dmg \n player armor: " + playerArmor );
      //calcolo danno
          if ( computerChoice.getDmg() - playerArmor > 0){
            ent1.entIsDmg(computerChoice.getDmg() - playerArmor);
          }
      System.out.println(" player hp: " + ent1.getHp());

      } while (ent1.getHp() > 0 && ent2.getHp() > 0 && !isPlayerEscaped);

      //RESULTS
        if (ent1.getHp() > 0){
            return true;
        } else if (isPlayerEscaped == true){
            System.out.println("sei riuscito a fuggire");
            return false;
        } else {
            return false;
        }
    }


}
