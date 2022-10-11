package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        //Find the smallest element

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("Minimum : " + min(numbers));
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (double i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
