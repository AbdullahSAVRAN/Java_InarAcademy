package chapters.chapter13;

public class Exercise13_09 {
    public static void main(String[] args) {
        //Enable Circle comparable

        Circle circle1 = new Circle(9, "blue", true);
        Circle circle2 = new Circle(2, "green", false);
        Circle circle3 = new Circle(9, "blue", true);
        System.out.println("CIRCLE-1 RADIUS : " + circle1.getRadius());
        System.out.println("CIRCLE-2 RADIUS : " + circle2.getRadius());
        System.out.println("CIRCLE-3 RADIUS : " + circle3.getRadius());

        System.out.println("CIRCLE-1 " + (circle1.equals(circle2) ? "" : "NOT ") + "EQUAL TO CIRCLE-2");
        System.out.println("CIRCLE-1 " + (circle1.equals(circle3) ? "" : "NOT ") + "EQUAL TO CIRCLE-3");
    }
}
