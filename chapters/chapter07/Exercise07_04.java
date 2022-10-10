package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        //Analyze scores

        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores :");
        int[] scores = new int[100];
        int numOfScores = 0;
        double average = 0;
        int number;
        for (int i = 0; i < 100; i++) {
            number = input.nextInt();
            if (number < 0) {
                break;
            }
            scores[i] = number;
            average += number;
            numOfScores++;
        }
        average /= numOfScores;
        int aboveOrEqual = 0;
        int below = 0;
        for (int i = 0; i < numOfScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }
        System.out.println("\nAverage of scores: " + average);
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}

