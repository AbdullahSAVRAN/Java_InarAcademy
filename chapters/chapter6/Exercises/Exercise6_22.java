package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_22 {
    public static void main(String[] args) {
        //Math: approximate the square root

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The approximated square root of " + number + " is: " + sqrt(number));
    }

    public static double sqrt(long n) {
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;
        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) / 2;
    }
}


