package chapters.chapter09;

import java.util.GregorianCalendar;

public class Exercise09_05 {
    public static void main(String[] args) {
        //Use the GregorianCalendar class

        GregorianCalendar c = new GregorianCalendar();
        System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
        System.out.println(c.get(c.MONTH) + "/" + c.get(c.DAY_OF_MONTH) + "/" + c.get(c.YEAR));
        c.setTimeInMillis(1234567898765L);
        System.out.print("\nElapsed time since January 1, 1970 set to " + "1234567898765L in format Mth/Day/Year: ");
        System.out.println(c.get(c.MONTH) + "/" + c.get(c.DAY_OF_MONTH) + "/" + c.get(c.YEAR));
    }
}
