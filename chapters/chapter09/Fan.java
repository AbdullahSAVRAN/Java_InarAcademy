package chapters.chapter09;

public class Fan {
    final static int slow = 1;
    final static int medium = 2;
    final static int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan() {
        speed = slow;
        on = false;
        radius = 5;
        color = "blue";
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case slow:
                s = "SLOW";
                break;
            case medium:
                s = "MEDIUM";
                break;
            case fast:
                s = "FAST";
        }
        return s;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius + "\n";
        } else {
            return "\nFan color: " + color + ", radius: " + radius + "\nfan is off\n";
        }
    }
}
