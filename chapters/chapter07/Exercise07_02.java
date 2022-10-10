package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        //Reverse the numbers entered

        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten integers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        display(arr);

    }

    public static void display(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
