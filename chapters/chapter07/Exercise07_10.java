package chapters.chapter07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        //Find the index of the smallest element

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Minimum : " + numbers[indexOfSmallestElement(numbers)] + " index : " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        double min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
