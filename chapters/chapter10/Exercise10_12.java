package chapters.chapter10;

public class Exercise10_12 {

    public static void main(String[] args) {
        //Geometry: the Triangle2D class


        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("   T1  ");
        System.out.println("-------");
        System.out.println("AREA : " + t1.getArea());
        System.out.println("PERIMETER : " + t1.getPerimeter());
        System.out.println("RESULT : " + t1.contains(new MyPoint(3, 3)));

        System.out.println("RESULT(CONTAINS) : " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("RESULT(OVERLAPS) : " + t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

    }
}