package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_05 {
    public static void main(String[] args) {
       //Sort three numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers :");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumber(num1,num2,num3);
    }
    public static void displaySortedNumber(double num1, double num2,double num3) {
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println(num3 + " < " + num2 + " < " + num1);
        }
        if (num1 > num2 && num1 > num3 && num2 < num3) {
            System.out.println(num2 + " < " + num3 + " < " + num1);
        }
        if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println(num3 + " < " + num1 + " < " + num2);
        }
        if (num2 > num1 && num2 > num3 && num1 < num3) {
            System.out.println(num1 + " < " + num3 + " < " + num2);
        }
        if (num3 > num2 && num1 < num3 && num2 > num1) {
            System.out.println(num1 + " < " + num2 + " < " + num3);
        }
        if (num3 > num2 && num1 < num3 && num2 < num1) {
            System.out.println(num2 + " < " + num1 + " < " + num3);
        }if(num2 == num1 || num1 == num3 || num2 == num3){
            System.err.println("There is an equality.Please try again.");

        }
    }
}