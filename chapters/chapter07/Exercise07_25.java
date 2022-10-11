package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args) {
        //Algebra : solve quadratic equations


        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a,b,c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double[] values = new double[]{a, b, c};
        double[] root = new double[2];
        int roots = solveQuadratic(values, root);
        System.out.println("The number of real roots : " + roots);
        if (roots != 0) {
            System.out.println("The real roots : ");
            for (double value : root) {
                if (value != 0) {
                    System.out.println(value + " ");
                }
            }
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double d = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        if (d < 0) {
            return 0;
        } else if (d == 0) {
            roots[0] = (-1 * eqn[1] + (Math.pow(d, 0.5)) / (2 * eqn[0]));
            return 1;
        } else {
            roots[0] = (-1 * eqn[1]) + ((Math.pow(d, 0.5)) / (2 * eqn[0]));
            roots[0] = (-1 * eqn[1]) + ((Math.pow(d, 0.5)) / (2 * eqn[0]));
            return 2;

        }
    }
}
