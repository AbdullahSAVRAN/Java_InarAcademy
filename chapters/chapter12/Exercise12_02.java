package chapters.chapter12;

import java.util.*;

public class Exercise12_02 {
    public static void main(String[] args) {
        //InputMismatchException

        Scanner input = new Scanner(System.in);
        boolean b = true;

        System.out.print("ENTER TWO NUMBERS : ");
        do {
            try {
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.println("SUM : " + (x + y));
                b = false;
            } catch (InputMismatchException ex) {
                System.out.println("TRY AGAIN...  (INCORRECT INPUT : PLEASE ENTER TWO INTEGERS...)");
                input.nextLine();
            }
        } while (b);
    }
}
