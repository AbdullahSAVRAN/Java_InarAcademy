package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        //Sorted?

        Scanner input = new Scanner(System.in);
        System.out.println("Enter list: ");
        int[] numbers = new int[input.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");

        }
    }

    public static boolean isSorted(int[] list) {
        boolean sorted = true;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    sorted = false;
                    break;
                }
            }
        }
        return sorted;
    }

}
