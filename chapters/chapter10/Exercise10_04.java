package chapters.chapter10;

public class Exercise10_04 {
    public static void main(String[] args) {
        //The MyPoint class

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.printf("DISTANCE : %2.3f ", point1.distance(point2));
    }
}
