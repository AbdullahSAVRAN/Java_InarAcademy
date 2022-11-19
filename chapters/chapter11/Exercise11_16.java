package chapters.chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise11_16 {
    public static void main(String[] args) {
        //Addition quiz

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<Integer>();
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.print(number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            if (answers.equals(answer)) {
                System.out.println("YOUR ANSWER IS TRUE :  " + answer);
            }
            else {
                System.out.print("YOUR ANSWER IS WRONG PLEASE TRY AGAIN... " + number1 + " + " + number2 + " ? ");
                answers.add(answer);
            }
            answer = input.nextInt();
        }

        System.out.println("YOU GOT IT !!!");
    }
}
