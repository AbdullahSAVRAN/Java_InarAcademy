package chapters.chapter13;

import java.util.Scanner;

public class Exercise13_01 {

    public static void main(String[] args) {
        //Triangle class


        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THREE SIDES : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("ENTER COLOR : ");
        String color = input.next();
        System.out.print("IS FILLED (true / false)? ");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle);
    }
}
