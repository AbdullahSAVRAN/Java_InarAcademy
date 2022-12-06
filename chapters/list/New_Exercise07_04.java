package chapters.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class New_Exercise07_04 {
    public static void main(String[] args) {
        //Analyze scores


        List<Double> scores = getScores();
        analyzeScores(scores);
    }

    private static List<Double> getScores() {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER SCORES BETWEEN 0 AND 100 (negative number = end) : ");
        List<Double> scores = new ArrayList<>();
        while (true) {
            double score = input.nextInt();
            if (score < 0) {
                break;
            } else if (score > 100) {
                System.out.println("ENTER SCORES BETWEEN 0 AND 100...");
            } else {
                scores.add(score);
            }
        }
        return scores;
    }

    private static void analyzeScores(List<Double> scores) {
        double sum = 0;
        for (Double score : scores) {
            sum += score;
        }
        double average = sum / scores.size();
        int numberOfAboveAverage = 0;
        int numberOfBelowAverage = 0;
        for (Double score : scores) {
            if (score < average) {
                numberOfBelowAverage++;
            } else
                numberOfAboveAverage++;
        }
        System.out.println("AVERAGE : " + average);
        System.out.println(numberOfAboveAverage + " SCORE" + ((numberOfAboveAverage > 1) ? "s" : "") + " ARE ABOVE THE AVERAGE...");
        System.out.println(numberOfBelowAverage + " SCORE" + ((numberOfBelowAverage > 1) ? "s" : "") + " ARE BELOW THE AVERAGE...");
    }
}