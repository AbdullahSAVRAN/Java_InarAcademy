package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        //Pattern recognition: consecutive four equal numbers

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int[] numOfValues = new int[input.nextInt()];
        System.out.print("Enter the values: ");
        for (int i = 0; i < numOfValues.length; i++) {
            numOfValues[i] = input.nextInt();
        }
        if (isConsecutiveFour(numOfValues)) {
            System.out.println("The list has consecutive fours ");
        } else {
            System.out.println("The list has no consecutive fours ");
        }
    }

    public static boolean isConsecutiveFour(int[] n) {
        int count = 1;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] == n[i + 1]) {
                count++;
            }
            if (count >= 4) {
                return true;
            }
            if (n[i] != n[i + 1]) {
                count = 1;
            }
        }
        return false;
    }
}