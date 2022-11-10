package chapters.chapter10;

public class Exercise10_14 {
    public static void main(String[] args) {
        //The MyDate class

        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("DATE1: " + date1.getMonth() + "/" + date1.getDay() + "/" + date1.getYear());
        System.out.println("DATE2: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear());
    }
}

