package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_06 {
    public static void main(String[] args) {
        //Display patterns

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = input.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n){
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            space--;
        }
}
}
