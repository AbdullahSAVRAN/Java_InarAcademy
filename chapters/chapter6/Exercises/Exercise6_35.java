package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_35 {
    public static void main(String[] args) {
        //Geometry: area of a pentagon

        Scanner input = new Scanner(System.in);
        System.out.println("Enter side : ");
        double side = input.nextDouble();
        System.out.printf("The area of the pentagon is : %2.3f", area(side));
    }

    public static double area(double side) {
        return ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)));
    }
}
