package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_37 {
    public static void main(String[] args) {
        //Format an integer

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        System.out.println("Enter a width : ");
        int width = input.nextInt();
        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {
        String s = number + " ";
        if (s.length() < width) {
            for (int i = width - s.length(); i >= 0; i--) {
                s = 0 + s;
            }
        }
        return s;
    }
}
