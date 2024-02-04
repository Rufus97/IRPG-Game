package Input;
import java.util.Random;

public class Casuale {
    

    public static double numeroCasuale(){
        
        return new Random().nextDouble();
    }

    public static int numeroCasualeInt(){

        return (int) (Math.random() * 100);
    }

    public static int numeroCasualeTra(int min, int max){

        try{
        return new Random().nextInt(max - min + 1) + min;
        }catch(Exception e){
            return min;
        }
    }
}
