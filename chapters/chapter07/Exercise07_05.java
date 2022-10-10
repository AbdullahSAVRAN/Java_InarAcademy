package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        //Print distinct numbers

        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int number;
        int count = 0;
        System.out.println("Enter ten integers : ");
        for (int i = 0; i < 10; i++) {
            number = input.nextInt();
            if (isDistinct(arr, number)) {
                arr[count] = number;
                count++;
            }
        }
        System.out.println("The number of distinct number : " + count);
        System.out.println("The distinct numbers are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(" " + arr[i]);
            }
        }
    }

    public static boolean isDistinct(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return false;
            }
        }
        return true;
    }
}
