package chapters.chapter10;

public class Exercise10_13 {
    public static void main(String[] args) {
        //Geometry: the MyRectangle2D class

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("AREA : " + r1.getArea());
        System.out.println("PERIMETER : : " + r1.getPerimeter());
        if (r1.contains(3, 3)) {
            System.out.println("RECTANGLE CONTAINS (3,3)");
        } else {
            System.out.println("RECTANGLE DOES NOT CONTAIN (3,3)");
        }
        System.out.println((r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "CONTAINS " :
                "DOES NOT CONTAIN") + " WITH (4, 5, 10.5, 3.2)");
        if (r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))) {
            System.out.println("OVERLAPS WITH (3,5,2.3,5.4");
        } else {
            System.out.println("DOES NOT OVERLAP WITH (3,5,2.3,5.4)");
        }

    }
}
