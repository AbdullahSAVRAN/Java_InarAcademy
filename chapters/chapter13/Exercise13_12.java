package chapters.chapter13;

public class Exercise13_12 {
    public static void main(String[] args) {
        //Sum the areas of geometric objects


        GeometricObject[] array = {new Circle(1), new Circle(3), new Rectangle(7, 9), new Rectangle(5, 8)};

        System.out.println("TOTAL AREA : " + sumArea(array));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
