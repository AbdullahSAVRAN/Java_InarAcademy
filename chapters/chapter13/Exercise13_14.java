package chapters.chapter13;

public class Exercise13_14 {
    public static void main(String[] args) {
        //Demonstrate the benefits of encapsulation

        Rational r1 = new Rational(10, 2);
        Rational r2 = new Rational(2, 5);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());

    }
}
