package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        //Central city

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities : ");
        int numOfCities = input.nextInt();
        double[][] coordinate = new double[numOfCities][2];
        System.out.println("Enter the coordinates of these cities : ");
        for (int i = 0; i < coordinate.length; i++) {
            for (int j = 0; j < coordinate[i].length; j++) {
                coordinate[i][j] = input.nextDouble();
            }
        }
        double[][] distance = findDistance(coordinate);
        double[] sumOfDistance = new double[distance.length];
        for (int i = 0; i < sumOfDistance.length; i++) {
            for (int j = 0; j < sumOfDistance.length; j++) {
                sumOfDistance[i] += distance[i][j];
            }
        }
        int min = indexOfMin(sumOfDistance);
        System.out.println("The central city is at (" + coordinate[min][0] + " , " + coordinate[min][1] + ")");
        System.out.printf("Total distance is : %.2f", sumOfDistance[min]);
    }

    public static int indexOfMin(double[] array) {
        int index = 0;
        double minDist = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minDist > array[i]) {
                minDist = array[i];
                index = i;
            }
        }
        return index;
    }

    public static double[][] findDistance(double[][] array) {
        double[][] d = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double x1 = array[i][0];
                double x2 = array[j][0];
                double y1 = array[i][1];
                double y2 = array[j][1];
                d[i][j] = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
            }
        }
        return d;
    }
}
