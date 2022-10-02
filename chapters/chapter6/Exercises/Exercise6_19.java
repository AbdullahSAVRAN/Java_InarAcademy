package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_19 {
    public static void main(String[] args) {
        //The MyTriangle class

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (isValid(side1,side2,side3)){
            System.out.printf("Area of the triangle : %.3f",area(side1,side2,side3));
        }else{
            System.err.println("INVALID INPUT...");
        }
    }
    public static boolean isValid(double side1,double side2, double side3){
       boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
           return valid;
    }
    public static double area(double side1,double side2,double side3){
        double d = (side1 + side2 + side3) / 2;
        return Math.sqrt(d * (d - side1) * (d - side2) * (d - side3));
    }
}
