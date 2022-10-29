package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_36 {
    public static void main(String[] args) {
        //Latin square

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        char[][] square = new char[n][n];
        System.out.println("Enter 4 rows of letters separated by spaces:");
        initializeSquare(square);
        System.out.println("The array is" + (isLatinSquare(square) ? " " : " not ") + "a Latin square");
    }

    public static boolean isLatinSquare(char[][] s) {
        return isDistinctRow(s) && isDistinctColumn(s);
    }

    public static boolean isDistinctRow(char[][] c) {
        for (int i = 0; i < c.length; i++) {
            int[] counts = new int[c.length]; // Occurrence of each letter
            for (int j = 0; j < c[i].length; j++) {
                counts[c[i][j] - 65]++;
                if (counts[c[i][j] - 65] > 1)
                    return false;
            }
        }
        return true;
    }

    public static boolean isDistinctColumn(char[][] c) {
        for (int i = 0; i < c.length; i++) {
            int[] counts = new int[c[0].length]; // Occurrence of each letter
            for (int j = 0; j < c[i].length; j++) {
                counts[c[j][i] - 65]++;
                if (counts[c[j][i] - 65] > 1)
                    return false;
            }
        }
        return true;
    }

    public static void initializeSquare(char[][] c) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                String str = input.next();
                char ch = str.charAt(0);
                if (ch >= 'A' && ch < (char) ('A' + c.length))
                    c[i][j] = ch;
                else {
                    System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + c.length - 1));

                }
            }
        }
    }
}
