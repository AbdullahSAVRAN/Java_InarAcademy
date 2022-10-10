package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        //Count occurrence of numbers

        int[] counts = new int[100];
        counter(counts);
        display(counts);

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((i + 1) + " occurs " + arr[i] + " time ");
            }
        }
    }

    public static void counter(int[] counts) {
        System.out.println("Enter the integers between 1 - 100 :");
        Scanner input = new Scanner(System.in);
        int number;
        do {
            number = input.nextInt();
            if (number >= 1 && number <= 100) {
                counts[number - 1]++;
            }
        }
        while (number != 0);
    }
}
