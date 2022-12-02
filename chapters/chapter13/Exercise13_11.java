package chapters.chapter13;

public class Exercise13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //The Octagon class


        Octagon octagon1 = new Octagon(5);
        System.out.println("AREA : " + octagon1.getArea() + "\nPERIMETER : " + octagon1.getPerimeter());
        System.out.println("CLONING...");
        Octagon octagon2 = (Octagon) octagon1.clone();
        int result = (octagon1.compareTo(octagon2));
        if (result == 1) {
            System.out.println("OCTAGON GREATER THAN CLONE...");
        } else if (result == -1) {
            System.out.println("OCTAGON LESS THAN CLONE...");
        } else {
            System.out.println("OCTAGON EQUAL TO CLONE...");
        }
    }
}
