package Input;
import Main.GamePanel;
public class Dado {

    Double y;
    Double x ;
    Double karmaNorm ;

    public double normalizzaKarma(){

        //normalizza karma *2
        double karmaNorm = GamePanel.giocatore.getKarma() * 2;

        //inverti segno
        karmaNorm = karmaNorm * -1;

        return karmaNorm;

    }
    public int getDado(int minimo , int massimo){

        x = Input.Casuale.numeroCasuale();

    /*
    System.out.println("il random num è " + x);
    System.out.println("il karma è " + GamePanel.giocatore.getKarma());
    System.out.println("il karma normalizzato è " + normalizzaKarma());
    */

        y =  (0.5 * x * (normalizzaKarma() * (x-1)+2));

        y = minimo + (y * massimo);
        // System.out.println("y è " + y);

        int dado = y.intValue();
        //System.out.println("il dado è " + dado);

        return dado;
    }

}
