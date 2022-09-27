package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_29 {
    public static void main(String[] args) {
        //Display calendars

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int day = input.nextInt();
        String s;
        System.out.println();
        for (int month = 1; month <= 12; month++) {
            s = "";
            switch (month) {
                case 1:
                    s += "January ";
                    break;
                case 2:
                    s += "February ";
                    break;
                case 3:
                    s += "March ";
                    break;
                case 4:
                    s += "April ";
                    break;
                case 5:
                    s += "May ";
                    break;
                case 6:
                    s += "June ";
                    break;
                case 7:
                    s += "July ";
                    break;
                case 8:
                    s += "August ";
                    break;
                case 9:
                    s += "September ";
                    break;
                case 10:
                    s += "October ";
                    break;
                case 11:
                    s += "November ";
                    break;
                case 12:
                    s += "December ";
                    break;
            }
            s += year + "";

            for (int b = 0; b < 23 - (s.length() / 2); b++) {
                System.out.print(" ");
            }
            System.out.println(s + "\n-----------------------------------------------\n " + "Sun    Mon    Tue    Wed    Thu    Fri    Sat");

            day %= 7;
            for (int b = 0; b <= day * 7; b++) {
                System.out.print(" ");
            }
            int day1 = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                day1 += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                day1 += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    day1 += 29;
                else
                    day1 += 28;
            }
            for (int d = 1; d <= day1; d++) {
                if (d < 10)
                    System.out.print(" ");
                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "     ");
                    if (d == day1)
                        System.out.println();
                }
                day++;
            }
            System.out.println();
        }
    }
}