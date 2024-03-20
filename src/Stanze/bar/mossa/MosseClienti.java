package Stanze.bar.mossa;

import Main.Utility.Moves;

public class MosseClienti implements Moves {

        private int dmg;
        private String moveName;
        public MosseClienti(int dmg, String moveName){
            this.dmg = dmg;
            this.moveName = moveName;
        }

        @Override
        public String getName() {
            return this.moveName;
        }

        @Override
        public int getDmg() {
            return this.dmg;
        }

        @Override
        public void moveEff() {

        }
    }
