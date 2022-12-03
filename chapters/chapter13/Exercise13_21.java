package chapters.chapter13;

import java.util.Scanner;

public class Exercise13_21 {
    public static void main(String[] args) {
        //Algebra: vertex form equations


        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A,B,C : ");
        Rational a = new Rational(input.nextLong(), 1);
        Rational b = new Rational(input.nextLong(), 1);
        Rational c = new Rational(input.nextLong(), 1);
        Rational h = new Rational(-b.getNumerator(), 2 * a.getNumerator());
        Rational k = (a.multiply(h.multiply(h)).add(b.multiply(h))).add(c);
        System.out.println("H : " + h + " K : " + k);
    }
}
