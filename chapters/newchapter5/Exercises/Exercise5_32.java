package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_32 {
    public static void main(String[] args) {
        //Game: lottery
        Scanner input = new Scanner(System.in);
        int lottery ;
        int b ;
        int a ;
       do {
           lottery = (int)(9 + Math.random() * 90);
           b = lottery % 10;
           a = lottery / 10;
       }
           while (a == b);
        System.out.println("Enter your guess :");
        int guess = input.nextInt();
        int c = guess / 10;
        int d = guess % 10;
        System.out.println("The lottery : "+  lottery);
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (d == a && c == b)
            System.out.println("Match all digits: you win $3,000");
        else if (c == a || c == b || d == a
                || d == b)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");

        }

    }

