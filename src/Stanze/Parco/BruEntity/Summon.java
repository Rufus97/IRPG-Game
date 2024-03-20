package Stanze.Parco.BruEntity;

import Main.Utility.Entity;
import Main.Utility.Moves;
import Stanze.Parco.BruEntity.Guards.InfamousGuards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

  public class Summon implements Moves {


      @Override
      public String getName() {
          return "summon two guards, what an infame ";
      }

      @Override
      public int getDmg() {
          return 0;
      }

      @Override
      public void moveEff() {

      }

  }
