package chapters.chapter13;

public class Exercise13_10 {
    public static void main(String[] args) {
        //Enable Rectangle comparable

        Rectangle r1 = new Rectangle(2, 6, "blue", true);
        Rectangle r2 = new Rectangle(1, 8, "green", false);
        Rectangle r3 = new Rectangle(7, 5, "blue", true);

        System.out.println("RECTANGLE-1 AREA :" + r1.getArea());
        System.out.println("RECTANGLE-2 AREA :" + r2.getArea());
        System.out.println("RECTANGLE-3 AREA :" + r3.getArea());

        System.out.println("RECTANGLE-1 " + (r1.equals(r2) ? "" : "NOT ") + "EQUAL TO RECTANGLE-2");
        System.out.println("RECTANGLE-1 " + (r1.equals(r3) ? "" : "NOT ") + "EQUAL TO RECTANGLE-3");
    }
}


