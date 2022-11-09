package chapters.chapter09;

import java.util.Scanner;

public class Exercise09_11 {
    public static void main(String[] args) {
        //Algebra: 2 * 2 linear equations

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquations linearEquations = new LinearEquations(a, b, c, d, e, f);
        if (linearEquations.isSolvable()) {
            System.out.println("X : " + linearEquations.getX() + "  Y :  " + linearEquations.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
