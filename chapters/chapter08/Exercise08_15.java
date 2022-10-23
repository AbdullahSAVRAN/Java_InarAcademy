package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_15 {
    public static void main(String[] args) {
        //Geometry: same line?

        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        System.out.println("The five points are" + (sameLine(points) ? " " : " not ") + "on the same line");
    }

    public static boolean sameLine(double[][] p) {
        for (int i = 0; i < p.length - 2; i += 3) {
            if (pointPosition(p[i][0], p[i][1], p[i + 1][0], p[i + 1][1], p[i + 2][0], p[i + 2][1]) != 0) {
                return false;
            }
        }
        return true;
    }

    public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
}
