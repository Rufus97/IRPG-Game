package Stanze.Mercato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MercatoInputs {

     Scanner input = new Scanner(System.in);
    public int getInt() {
        Boolean check = false;
        int sc = 0;

        do {
            check = false;
            String s = input.nextLine();

            try {
                sc = Integer.valueOf(s);
            } catch (Exception e) {
                check = true;
                if (!"".equals(s)) {
                    System.out.println("input non valido");
                }
            }

        } while (check);
        return sc;
    }
}
