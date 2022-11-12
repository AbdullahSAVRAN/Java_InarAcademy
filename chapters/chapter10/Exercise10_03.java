package chapters.chapter10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise10_03 {
    public static void main(String[] args) {
        //The MyInteger class


        Scanner input = new Scanner(System.in);
        MyInteger number = new MyInteger(113);
        if (number.isEven()) {
            System.out.println("EVEN NUMBER...");
        }
        if (number.isOdd()) {
            System.out.println("ODD NUMBER...");
        }
        if (number.isPrime()) {
            System.out.println("PRIME NUMBER...");
        }
        System.out.println("Enter an integer");
        int n = input.nextInt();
        if (number.equals(n)) {
            System.out.println(number.getValue() + " and " + n + " are equals...");
        } else {
            System.out.println(number.getValue() + " and " + n + " are not equals...");
        }
    }
}