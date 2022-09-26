package chapters.newchapter5.Exercises;
import java.util.Scanner;
public class Exercise5_34 {
    public static void main(String[] args) {
       //Game: scissor, rock, paper

        int users = 0;
        int computer = 0;
        do {
            Scanner input = new Scanner(System.in);
            int c = (int) (Math.random() * 3);

            System.out.println("Enter a number : (scissor = 0 , rock = 1 , paper = 2 ");
            int user = input.nextInt();

            for (int i = 1; i < 3; i++) {
                if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
                    System.out.println("You won");
                    users++;

                }

                else if ((computer == 2 && user == 1) || (user == 2 && computer == 0) || (user == 0 && computer == 1)) {
                    System.out.println("Computer won");
                    computer++;

                }
            }
            System.out.println("Computer wins: " + computer + "\nUser wins: " + users);
        } while (Math.abs(users - computer) == 2);

    }
}
