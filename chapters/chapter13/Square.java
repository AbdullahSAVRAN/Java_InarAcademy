package chapters.chapter13;

public class Square extends GeometricObject implements Colorable {


    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return side * 4;
    }

    public String howToColor() {
        return "COLOR ALL SIDES...";
    }

    public String toString() {
        return super.toString() + "\nSIDE : " + side + "\nAREA : " + getArea() + "\nPERIMETER : " + getPerimeter();
    }

}
