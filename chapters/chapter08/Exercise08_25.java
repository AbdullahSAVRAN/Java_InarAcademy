package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        //Markov matrix

        double[][] matrix = matrix();
        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }

    }

    public static double[][] matrix() {
        Scanner input = new Scanner(System.in);
        double[][] d = new double[3][3];
        System.out.println("Enter a 3-3 matrix row by row : ");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = input.nextDouble();
            }
        }
        return d;
    }

    public static boolean isMarkovMatrix(double[][] d) {
        return isPositive(d) && isSum1(d);
    }

    public static boolean isPositive(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSum1(double[][] d) {
        for (int col = 0; col < d.length; col++) {
            double sum = 0;
            for (int row = 0; row < d.length; row++) {
                sum += d[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
}
