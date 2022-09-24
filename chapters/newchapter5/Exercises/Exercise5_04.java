package chapters.newchapter5.Exercises;

public class Exercise5_04 {
    public static void main(String[] args) {
        //Conversion from miles to kilometers

        double km = 0;

        System.out.println("Miles          Kilometers");
        for (int mile = 1; mile < 11; mile++) {

            km = (mile * 1.609);
            System.out.printf("%-15d%6.3f\n", mile, km);
        }
    }
}