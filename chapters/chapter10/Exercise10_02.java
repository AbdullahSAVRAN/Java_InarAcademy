package chapters.chapter10;

public class Exercise10_02 {
    public static void main(String[] args) {
        //The BMI class

        Bmi person1 = new Bmi("Ali", 20, 296, 5, 10);
        System.out.println(person1.getName() + "'s result is : " + person1.getBmi() + " >>> " + person1.result());

        Bmi person2 = new Bmi("Ayse", 120, 70);
        System.out.println(person2.getName() + "'s result is  : " + person2.getBmi() + " >>> " + person2.result());
    }
}
