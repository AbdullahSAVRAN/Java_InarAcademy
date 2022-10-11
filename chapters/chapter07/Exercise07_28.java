package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_28 {
    public static void main(String[] args) {
        //Math: combinations

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        combinations(numbers);
    }

    public static void combinations(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i != j)
                    System.out.println(n[i] + " " + n[j]);
            }
        }
    }
}
