package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_48 {
    public static void main(String[] args) {
        //Process string

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = input.nextLine();
        int l = s.length();
        for (int i = 0; i < l; i+= 2){
            System.out.print(s.charAt(i));

        }

    }
}
