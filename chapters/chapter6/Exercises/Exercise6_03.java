package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_03 {
    public static void main(String[] args) {
       //Palindrome integer

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        int reverse = reverse(number);
        System.out.println("The reverse of the number : " + reverse);
        System.out.println("Is number a palindrome ? : "  + isPalindrome(number));
    }

    public static int reverse(int number) {
        int n = 0;
        int reverse = 0;
        while (number > 0) {
            n = number % 10;
            reverse = reverse * 10 + n;
            number = number / 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {

        return number == reverse(number) ? true : false;
    }
    }

