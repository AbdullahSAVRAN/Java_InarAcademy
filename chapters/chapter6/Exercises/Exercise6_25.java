package chapters.chapter6.Exercises;
import java.util.Scanner;
public class Exercise6_25 {
    public static void main(String[] args) {
        //Convert milliseconds to hours, minutes, and seconds

        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(millis));
    }
    public static String convertMillis(long millis) {
        millis /= 1000;
        String time = "";
        for (int i = 0; i < 2; i++) {
            time = ":" + millis % 60 + time;
            millis /= 60;
        }
        return millis + time;
    }

}
