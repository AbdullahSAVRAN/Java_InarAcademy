package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args) {
        //Culture: Chinese Zodiac

        Scanner input = new Scanner(System.in);
        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println("This year is : " + zodiacs[year % 12]);
    }
}
