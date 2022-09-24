package chapters.newchapter5.Exercises;

public class Exercise5_24 {
    public static void main(String[] args) {
        //Sum a series
        double result = 0;
        for (double i = 1,j = 3; i< 98 && j < 100; i+=2,j+=2 ){
            result += (i / j);
        }
        System.out.println("Result : " + result);
    }
}
