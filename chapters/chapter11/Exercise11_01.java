package chapters.chapter11;

import java.util.Scanner;

public class Exercise11_01 {
    public static void main(String[] args) {
        //The Triangle class

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THREE SIDES : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("ENTER COLOR : ");
        String color = input.next();
        System.out.print("IS TRIANGLE FILLED (FALSE / TRUE) ? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("AREA : " + triangle.getArea());
        System.out.println("PERIMETER : " + triangle.getPerimeter());
        System.out.println("COLOR : " + triangle.getColor());
        System.out.println("TRIANGLE : " + (triangle.isFilled() ? "" : " NOT ") + "FILLED");
    }
}