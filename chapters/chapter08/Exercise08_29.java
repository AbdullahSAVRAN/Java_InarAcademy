package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        //Identical arrays

        System.out.println("Enter a matrix1 : ");
        int[][] matrix1 = getArray();
        System.out.println("Enter a matrix2 : ");
        int[][] matrix2 = getArray();
        if (equals(matrix1, matrix2)) {
            System.out.println("THE TWO ARRAYS ARE IDENTICAL...");
        } else {
            System.out.println("THE TWO ARRAYS ARE NOT IDENTICAL...");
        }
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] x = new int[row][col];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = input.nextInt();
            }
        }
        return x;
    }

    public static boolean equals(int[][] x, int[][] x1) {
        int[] matrix1 = sort(x);
        int[] matrix2 = sort(x1);
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i] != matrix2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] matrix(int[][] x) {
        int[] y = new int[x.length * x[0].length];
        int z = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                y[z] = x[i][j];
            }
        }
        return y;
    }

    public static int[] sort(int[][] x) {
        int[] y = matrix(x);
        for (int i = 0; i < 3; i++) {
            int min = y[i];
            int index = i;
            for (int j = i + 1; j < 3; j++) {
                if (min > y[j]) {
                    min = y[j];
                    index = j;
                }
            }
            if (index != i) {
                y[index] = y[i];
                y[i] = min;
            }
        }
        return y;
    }
}
