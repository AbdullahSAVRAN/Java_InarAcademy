package chapters.chapter13;

public class Exercise13_07 {
    public static void main(String[] args) {
        //The Colorable interface

        GeometricObject[] squares = {new Square(6), new Square(26), new Square(36), new Square(11), new Square(7)};
        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSQUARE >>> " + (i + 1));
            System.out.println("AREA : " + squares[i].getArea());
            System.out.println("HOW TO COLOR : " + ((Square) squares[i]).howToColor());
        }
    }

}
