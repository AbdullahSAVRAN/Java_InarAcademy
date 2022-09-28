package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_02 {
    public static void main(String[] args) {
        //Sum the digits in an integer

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        long number = input.nextLong();
        System.out.println(" The sum of the digits for  " + number + " : " + sumDigits(number));


    }
    public static int sumDigits(long n) {

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
    }
            return  sum;
        }

    }

