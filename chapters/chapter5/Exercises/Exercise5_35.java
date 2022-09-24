package chapters.chapter5.Exercises;

public class Exercise5_35 {
    public static void main(String[] args) {
        //Summation
        double total = 0;
        for (int i = 1; i<= 624; i++){
              total += (1 / (Math.sqrt(i) + Math.sqrt(i + 1)));
        }
        System.out.println("Sum of this question : " + total);
    }
}
