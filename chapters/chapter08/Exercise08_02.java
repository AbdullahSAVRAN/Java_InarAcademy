package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_02 {
    public static void main(String[] args) {
        //Sum the major diagonal in a matrix

        double[][] matrix = matrix();
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double[][] matrix() {
        Scanner input = new Scanner(System.in);
        int rows = 4;
        int columns = 4;
        double[][] m = new double[rows][columns];
        System.out.println("Enter a 4-4 matrix row by row:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                m[row][col] = input.nextDouble();
            }
        }
        return m;
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}