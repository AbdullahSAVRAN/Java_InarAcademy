package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_18 {
    public static void main(String[] args) {
        //Bubble sort

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print(" ENTER TEN NUMBERS :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        bubbleSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
}

