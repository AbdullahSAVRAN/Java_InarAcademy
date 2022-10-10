package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        //Average an array

        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        System.out.print("Enter ten values : ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("The average value: " + average(values));
    }

    public static int average(int[] arr) {
        int average = 0;
        for (int i : arr)
            average += i;
        return average / arr.length;
    }

    public static double average(double[] arr) {
        double average = 0;
        for (double i : arr)
            average += i;
        return average / arr.length;
    }
}

