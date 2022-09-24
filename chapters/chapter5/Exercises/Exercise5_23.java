package chapters.chapter5.Exercises;

public class Exercise5_23 {
    public static void main(String[] args) {
      //Demonstrate cancellation errors
         left();
        right();
    }

    public static void left(){
        double result = 0;
        for (double i = 1; i <= 50000; i++){
            result += (1/i);
        }
        System.out.println("Result : " + result);

    }
    public static void right(){
        double result = 0;
        for (double i = 50000; i >= 1; i--){
            result += (1/i);
        }
        System.out.println("Result 1 : " + result);
    }
}
