package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        //Assign grades

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int[] students = new int[input.nextInt()];
        char[] grades = new char[students.length];
        System.out.println("Enter scores : ");
        for (int i = 0; i < students.length; i++) {
            students[i] = input.nextInt();
        }
        grades(students, grades);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " score is " + students[i] + " and grade is " + grades[i]);
        }
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void grades(int[] scores, char[] grades) {
        int note = max(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= note - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= note - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= note - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= note - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

        }
    }
}
