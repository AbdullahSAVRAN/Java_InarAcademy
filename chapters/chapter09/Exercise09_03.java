package chapters.chapter09;

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        //Use the Date class

        final long startTime = 10000;
        final long endTime = 10000000000L;
        Date date = new Date();

        for (long time = startTime; time < endTime; time *= 10) {
            date.setTime(time);
            System.out.println(date.toString());
        }
    }
}
