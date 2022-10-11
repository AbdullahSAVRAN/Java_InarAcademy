package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_17 {

    public static void main(String[] args) {
        //Sort students

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];
        System.out.println("Enter the name students and their scores :");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }
        sortDecreasing(students, scores);
        for (String e : students) {
            System.out.println(e);
        }
    }

    public static void sortDecreasing(String[] s, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int max = numbers[i];
            int maxIndex = i;
            String temp;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                temp = s[i];
                s[i] = s[maxIndex];
                s[maxIndex] = temp;
                numbers[maxIndex] = numbers[i];
                numbers[i] = max;
            }
        }
    }
}