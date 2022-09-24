package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_50 {
    public static void main(String[] args) {
        //Count upper case letter

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        int l = s.length();
        int upper = 0;
        for (int i = 0; i < l; i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            }

        }
        System.out.println("The number of upper case letter is : " + upper);
    }
}
