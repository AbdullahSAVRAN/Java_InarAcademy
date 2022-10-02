package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_23 {
    public static void main(String[] args) {
        //Occurrences of a specified character

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a message ");
        String s = input.nextLine();
        char c = 'a';
        System.out.println("Number of '" + c + "' character in the message : " + count(s,c));
    }
    public static int count(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))
                count++;
        }
        return count;
    }
}
