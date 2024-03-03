package Stanze.Mercato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MercatoInputs {

     Scanner input = new Scanner(System.in);
    public int getInt() {
        try{
      return input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("input errato, inserire un numero");
            return 0;
        }
    }
}
