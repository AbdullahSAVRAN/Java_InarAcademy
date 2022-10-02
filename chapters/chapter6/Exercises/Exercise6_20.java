package chapters.chapter6.Exercises;
import java.util.Scanner;
public class Exercise6_20 {
    public static void main(String[] args) {
        //Count the letters in a string

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String s = input.nextLine();
        System.out.println("The number of letters : " + countLetters(s));
    }
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                count++;
        }
        }
        return count;
    }
}
