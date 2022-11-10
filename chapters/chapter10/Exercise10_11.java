package chapters.chapter10;

public class Exercise10_11 {
    public static void main(String[] args) {
        //Geometry: the Circle2D class

        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf(" AREA : %2.3f\n", c1.getArea());
        System.out.printf(" PERIMETER : %2.3f\n", c1.getPerimeter());
        System.out.println(" CONTAIN(3,3) ? >>> " + c1.contains(3, 3));
        System.out.println(" CONTAIN(4,5,10.5) ? >>> " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(" CONTAIN(3,5,2.3) ? >>> " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
