package chapters.chapter10;

public class MyRectangle2D {


    private double x;
    private double y;
    private double width;
    private double height;

    MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.x = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return distance(this.y, y) <= height / 2 && distance(this.x, x) <= width / 2;
    }

    public boolean contains(MyRectangle2D n) {
        return distance(y, n.getY()) + n.getHeight() / 2 <= height / 2 &&
                distance(x, n.getX()) + n.getWidth() / 2 <= width / 2 &&
                height / 2 + n.getHeight() / 2 <= height &&
                width / 2 + n.getWidth() / 2 <= width;
    }

    public boolean overlaps(MyRectangle2D n) {
        return !contains(n) && ((x + width / 2 > n.getX() - n.getWidth()) ||
                (y + height / 2 > n.getY() - n.getHeight())) &&
                (distance(y, n.getY()) < height / 2 + n.getHeight() / 2) &&
                (distance(x, n.getX()) < width / 2 + n.getWidth() / 2);
    }

    private double distance(double x, double y) {
        return Math.sqrt(Math.pow(y - x, 2));
    }
}