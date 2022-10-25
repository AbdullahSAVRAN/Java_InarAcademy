package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_27 {
    public static void main(String[] args) {
        //Column sorting

        double[][] matrix = matrix();
        double[][] sortedMatrix = sortColumns(matrix);
        System.out.println(" NEW ARRAY ");
        System.out.println("-----------");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix.length; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] matrix() {
        Scanner input = new Scanner(System.in);
        double[][] d = new double[3][3];
        System.out.println("Enter a 3-3 matrix row by row:");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = input.nextDouble();
            }
        }
        return d;
    }

    public static double[][] sortColumns(double[][] d) {
        double[][] x = new double[d.length][d[0].length];
        copyMatrix(d, x);
        for (int col = 0; col < x.length; col++) {
            for (int row = 0; row < x.length - 1; row++) {
                double min = x[row][col];
                int index = row;
                for (int j = row + 1; j < x.length; j++) {
                    if (min > x[j][col]) {
                        min = x[j][col];
                        index = j;
                    }
                }
                if (index != row) {
                    x[index][col] = x[row][col];
                    x[row][col] = min;
                 }
            }
        }
        return x;
    }

    public static void copyMatrix(double[][] matrix, double[][] newMatrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
    }
}
