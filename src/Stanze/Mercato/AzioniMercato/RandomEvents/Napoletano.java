package Stanze.Mercato.AzioniMercato.RandomEvents;

import Main.GamePanel;
import Stanze.Mercato.AzioniMercato.RandomDice;
import Main.Utility.Scontro;
import Stanze.Mercato.MercatoInputs;

public class Napoletano {


    private MercatoInputs userInput = new MercatoInputs();
    private int muscolatura;

    private RandomDice rng = new RandomDice();

    public Napoletano(){
        this.muscolatura = rng.getDado(1,10);
    }
    public void afterFurto(MercatoInputs userInput){
        int choice = 0;
        do {
            System.out.println("cosa fai? " +
                    "\n1: insegui il malfattore, riavrò i miei 10 euro costi quel che costi " +
                    "\n2: lascio perdere");
            choice = userInput.getInt();
            if (choice == 1){
                Scontro fight = new Scontro();
                if (fight.scontro(determinaNapoletano())){
                    GamePanel.giocatore.setSoldi(10.0);
                    System.out.println("hai ripreso i tuoi 10 euri !!!" + GamePanel.giocatore.getSoldi());
                };
            } else if (choice == 2){
                System.out.println("hai lasciato perde");
                GamePanel.giocatore.mostraStatistiche();
            } else {
                System.out.println("devi sceglie fra");
            }
        } while (choice != 1 && choice != 2);
    }
    public void furto(MercatoInputs userInput){
        if (GamePanel.giocatore.controllaSoldi(-10.0)){
            System.out.println("ti senti toccare il culo, ti giri nella speranza di aver fatto colpo" +
                    "\nma aimè, vedi la schiena di un uomo che corre e ti rendi conto che il tuo borsello è " +
                    "macchiato di sugo e mozzarella");
            GamePanel.giocatore.mostraStatistiche();
            afterFurto(userInput);
        } else {
            System.out.println("gli occhi delusi di un uomo ti squadrano, il pensiero che tieni i soldi " +
                    "nascosti nel culo rende lo scontro inevitabile");
            //scontroNapoletanico(determinaNapoletano(), userInput);
        };
    }
    public NapoliEnum determinaNapoletano(){
        if (this.muscolatura == 1){
            System.out.println("oggi sei fortunato, più che un napoletano pare gollum");
            return NapoliEnum.GOLLUM;
        } else if(this.muscolatura < 5){
            System.out.println("è pallido come la mozzarella della sua terra ");
            return NapoliEnum.SMILZO;
        } else if(this.muscolatura == 5){
            System.out.println("è normale come un friariello accanto ad una salsiccia questo napoletano");
            return NapoliEnum.NORMALE;
        } else if (this.muscolatura < 10){
            System.out.println("questo napoletano è ben piazzato come le coltellate della sua terra natia");
            return NapoliEnum.PIAZZATO;
        } else {
            System.out.println("un ombra riveste la tua fragile figura, alto come il cornicione della miglior pizza, " +
                    "il napoletano leggendario proietta la sua ombra ergendosi contro di te, un pensiero rimbomba nella " +
                    "tua testa accompagnato da ogni suo passo, vale veramente 10 euro la mia vita?, presto conoscerai la risposta");
            return NapoliEnum.LEGGENDARIO;
        }
    }



    public void vincitoreScontro(int playerHp){
        if (GamePanel.giocatore.getHP() > 0){
            GamePanel.giocatore.setSoldi(10.0);
            System.out.println("hai vinto! recuperi i 10 euro dal corpo del napoli");
            GamePanel.giocatore.mostraStatistiche();
        } else {
            GamePanel.giocatore.controlloSetHP(0);
        }
    }



}
