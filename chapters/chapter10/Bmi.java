package chapters.chapter10;

public class Bmi {


    private String name;
    private int age;
    private double weight;
    private double height;
    final double kg_pound = 0.45359237;
    final double meter_inch = 0.0254;
    final int inch_foot = 12;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Bmi(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public Bmi(String name, int age, double weight, double feet, double inches) {
        this(name, age, weight, inches + feet * 12);
    }

    public double getBmi() {
        double bmi = weight * kg_pound / ((height * meter_inch) * (height * meter_inch));
        return Math.round(bmi * 100) / 100.0;
    }

    public String result() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "UNDERWEIGHT";
        } else if (bmi < 25) {
            return "NORMAL";
        } else if (bmi < 30) {
            return "OVERWEIGHT";
        } else {
            return "OBESE";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
