package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_38 {
    public static void main(String[] args) {
        //Decimal to octal

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal : ");
        int decimal = input.nextInt();
        String octal = "";
        for (int i = decimal; i > 0; i /= 8){
            octal = (i % 8) + octal;
        }
        System.out.println("The octal is : " + octal);
    }
}
