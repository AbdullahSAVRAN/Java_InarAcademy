package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_17 {
    public static void main(String[] args) {
        //Display pyramid

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");

        int numLines = input.nextInt();

        for (int i = 1; i <= numLines; i++) {
            int space = numLines - i;
            for (int s = 0; s < space; s++) {
                System.out.print("    ");
            }
            for (int leftSideNums = numLines - space; leftSideNums >= 2; leftSideNums--) {
                System.out.printf("%4d", (leftSideNums));
            }
            for (int rightSideNums = 1; rightSideNums < numLines - space + 1; rightSideNums++) {
                System.out.printf("%4d", (rightSideNums));
            }
            System.out.println();

        }
    }
}

