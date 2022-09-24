package chapters.chapter5.Exercises;

public class Exercise5_27 {
    public static void main(String[] args) {
        // Display leap years
        int count = 0;
        for (int year = 101; year<= 2100; year++){
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                System.out.print(year + " ");
                count++;
                if(count % 10 == 0){
                System.out.println();
            }}
        }
    }
}
