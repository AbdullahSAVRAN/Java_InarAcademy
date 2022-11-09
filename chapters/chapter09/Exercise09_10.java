package chapters.chapter09;

import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args) {
        //Algebra: quadratic equations

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("no real roots");
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("ROOTS :  " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else {
            System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ? quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
        }
    }
}
