package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        //Sum elements column by column

        double[][] matrix = matrix();
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
        }
    }

    public static double[][] matrix() {

        Scanner input = new Scanner(System.in);
        int rows = 3;
        int columns = 4;
        double[][] d = new double[rows][columns];
        System.out.println("Enter a " + rows + "-" + columns + " matrix:");
        for (int row = 0; row < d.length; row++)
            for (int col = 0; col < d[row].length; col++)
                d[row][col] = input.nextDouble();
        return d;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
