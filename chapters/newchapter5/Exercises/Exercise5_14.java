package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_14 {
    public static void main(String[] args) {
        //Compute the greatest common divisor

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();
        int gcd = 0;
        for (int i = 1; i < num1 || i < num2; i++){
            if (num1 % i == 0 && num2 % i == 0){
                 gcd = i;
            }
        }
              System.out.println("GCD : " + gcd);
    }
}
