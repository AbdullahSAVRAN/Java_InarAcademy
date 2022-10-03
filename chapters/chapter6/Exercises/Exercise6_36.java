package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_36 {
    public static void main(String[] args) {
        //Geometry: area of a regular polygon

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of side : ");
        int n = input.nextInt();
        System.out.println("Enter the side : ");
        double side = input.nextDouble();
        System.out.printf("The area of the polygon is : %2.3f", area(n, side));


    }

    public static double area(int n, double side) {
        return ((n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
    }
}
