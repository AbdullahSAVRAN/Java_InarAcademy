package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        //Revise selection sort

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        sort(numbers);
        for (double e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void sort(double[] d) {
        for (int i = d.length - 1; i >= 0; i--) {
            double max = d[i];
            int IndexOfMax = i;
            for (int j = i - 1; j >= 0; j--) {
                if (max < d[j]) {
                    max = d[j];
                    IndexOfMax = j;
                }
            }
            if (IndexOfMax != i) {
                d[IndexOfMax] = d[i];
                d[i] = max;
            }
        }
    }
}
