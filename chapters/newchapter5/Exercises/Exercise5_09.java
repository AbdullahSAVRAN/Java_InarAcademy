package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_09 {
    public static void main(String[] args) {
        // Find the two highest scores

        Scanner input = new Scanner(System.in);

        String secondName = "";
        int secondScore = 0;
        String name = "";
        int score = 0;
        System.out.println("Enter number of students : ");
        int numOfStudents = input.nextInt();
        System.out.println("Enter student name : ");
        String highName = input.next();
        System.out.println("Enter student score : ");
        int highScore = input.nextInt();


        for (int i = 1; i < numOfStudents; i++){
                System.out.println("Enter student name : ");
                name = input.next();
                System.out.println("Enter student score : ");
                score = input.nextInt();
                if (score > highScore){
                    secondScore = highScore;
                    secondName = highName;
                     highScore = score;
                     highName = name;
                } else if (score > secondScore){
                    secondScore = score;
                    secondName = name;
                }

        }
               System.out.println("The highest score is : " + highScore + " and winner is : " + highName);
        System.out.println("The second highest score is : " + secondScore + " and second one is : " + secondName);
    }
}
