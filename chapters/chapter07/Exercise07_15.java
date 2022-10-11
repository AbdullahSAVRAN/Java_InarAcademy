package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        //Eliminate duplicates

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.println("The distint numbers are : ");
        for (int e : distinctNumbers) {
            if (e > 0) {
                System.out.print(e + " ");
            }

        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;
        for (int e : list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
