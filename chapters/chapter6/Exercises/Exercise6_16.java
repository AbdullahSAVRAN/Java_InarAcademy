package chapters.chapter6.Exercises;

public class Exercise6_16 {
    public static void main(String[] args) {
        //Number of days in a year

        System.out.println("YEAR    DAYS");
        System.out.println("-------------");
        for(int year = 2000; year <= 2020; year++){
            System.out.printf("%d    %d\n",year,numberOfDaysInAYear(year));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if(leapYear(year)){
            return 366;
        }else {
            return 365;
        }
    }
    public static boolean leapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
