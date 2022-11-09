package chapters.chapter09;

public class Exercise09_08 {
    public static void main(String[] args) {
        //The Fan class

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.on();

        fan2.setSpeed(Fan.fast);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.on();

        System.out.println("Fan 1 toString: " + fan1.toString());
        System.out.println("Fan 2 toString: " + fan2.toString());
    }
}