package chapters.newchapter5.Exercises;
import java.util.Scanner;
public class Exercise5_28 {
    public static void main(String[] args) {
       //Display the first days of each month

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int day = input.nextInt();

        String s;
        for (int month = 1; month <= 12; month++) {
            s = "";
            switch (month) {
                case 1: s += "January "; break;
                case 2: s += "February "; break;
                case 3: s += "March "; break;
                case 4: s += "April "; break;
                case 5: s += "May "; break;
                case 6: s += "June "; break;
                case 7: s += "July "; break;
                case 8: s += "August "; break;
                case 9: s += "September "; break;
                case 10: s += "October "; break;
                case 11: s += "November "; break;
                case 12: s += "December "; break;
            }
            s += "1, " + year + " is ";
            day %= 7;
            switch (day) {
                case 0: System.out.println(s + "Sunday"); break;
                case 1: System.out.println(s + "Monday"); break;
                case 2: System.out.println(s + "Tuesday"); break;
                case 3: System.out.println(s + "Wednesday"); break;
                case 4: System.out.println(s + "Thursday"); break;
                case 5: System.out.println(s + "Friday"); break;
                case 6: System.out.println(s + "Saturday"); break;
            }
            if ( month == 1 || month == 3  || month == 5 || month == 7 ||
                    month == 8 || month == 10 ||month == 12)
                day += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                day += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    day += 29;
                else
                    day += 28;
            }
        }
    }
}
