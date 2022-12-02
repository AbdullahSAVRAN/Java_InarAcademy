package chapters.chapter13;

public class Exercise13_05 {
    public static void main(String[] args) {
        //Enable GeometricObject comparable


        Circle circle1 = new Circle(8, "yellow", true);
        Circle circle2 = new Circle(5, "blue", false);
        System.out.println("\nCIRCLE 1: ");
        print(circle1);
        System.out.println("\nCIRCLE 2: ");
        print(circle2);
        print("\nLARGE CIRCLE : ");
        print(Circle.max(circle1, circle2));
        Rectangle rectangle1 = new Rectangle(8, 10, "red", true);
        Rectangle rectangle2 = new Rectangle(2, 7, "grey", true);
        System.out.println("\nRECTANGLE 1: ");
        print(circle1);
        System.out.println("\nRECTANGLE 2: ");
        print(circle2);
        print("\nLARGE RECTANGLE : ");
        print(Rectangle.max(rectangle1, rectangle2));
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(GeometricObject o) {
        System.out.println(o);
    }
}
