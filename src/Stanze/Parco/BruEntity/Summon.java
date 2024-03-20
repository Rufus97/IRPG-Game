package Stanze.Parco.BruEntity;

import Main.Utility.Entity;
import Main.Utility.Moves;
import Main.Utility.SummonerMove;
import Stanze.Parco.BruEntity.Guards.InfamousGuards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

  public class Summon implements SummonerMove {
      private int cooldown = 2;

      private int staticCooldown= 2;

      @Override
      public Collection<Entity> summon() {
          return new ArrayList<>(Arrays.asList(new InfamousGuards(), new InfamousGuards()));
      }

      @Override
      public int cooldown() {
          return this.cooldown;
      }

      @Override
      public void cooldownDecrement() {
          cooldown--;
          if (this.cooldown <= 0){
              this.cooldown = 2;
          }
      }

      @Override
      public void cooldownUsed() {
          this.cooldown = 0;
      }

      @Override
      public void cooldownRestored() {
          this.cooldown = staticCooldown;
      }


      @Override
      public String getName() {
          return "brumotti has summoned two infamous guards";
      }

      @Override
      public int getDmg() {
          return 0;
      }

      @Override
      public void moveEff() {

      }
  }
