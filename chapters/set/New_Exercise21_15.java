package chapters.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class New_Exercise21_15 {
    public static void main(String[] args) {
        //Addition quiz


        int number1 = (int) (Math.random() * 20);
        int number2 = (int) (Math.random() * 20);
        Scanner input = new Scanner(System.in);
        System.out.print("WHAT IS " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        Set<Integer> wrongAnswers = new HashSet<>();

        while (number1 + number2 != answer) {
            if (wrongAnswers.contains(answer)) {
                System.out.println("YOUR ANSWER " + answer);
            } else {
                wrongAnswers.add(answer);
            }
            System.err.print("WRONG ANSWER... TRY AGAIN... WHAT IS " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("YOU GOT IT!!!");
    }

}
