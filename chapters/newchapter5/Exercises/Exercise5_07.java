package chapters.newchapter5.Exercises;

public class Exercise5_07 {
    public static void main(String[] args) {
        //Financial application: compute future tuition

        double tuition = 10000;
        double tuition1 = 0;
        double total = 0;
        for (int year = 1; year < 11; year++) {
            tuition = tuition + (tuition * 0.05);

            System.out.printf("%d. year : %8.3f\n", year, tuition);
        }
        for (int i = 1; i < 5; i++) {
            tuition += (tuition * 0.05);
            total = total + tuition;


        }
        System.out.printf("The last four years tuition is : %8.3f",total);
    }
}