package chapters.newchapter5.Exercises;

public class Exercise5_05 {
    public static void main(String[]args) {

        //Conversion from kilograms to pounds and pounds to kilograms

        System.out.println("Kilograms       Pounds  |   Pounds      Kilograms");
        double pound1 = 0;
        double kg1 = 0;
        for (int kg = 1,pound = 20; kg < 200; kg = kg + 2,pound = pound + 5) {
                pound1 = (kg * 2.2);
                kg1 = (pound / 2.2);


                System.out.printf("%-15d%6.1f   |    %-15d%6.2f\n", kg, pound1, pound, kg1);
            }
        }
    }

