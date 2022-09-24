package chapters.newchapter5.Exercises;

public class Exercise5_10 {
    public static void main(String[] args) {
        //Find numbers divisible by 5 and 6
        int count = 0;
        for ( int i = 100; i < 1001; i++){

            if (i % 5 == 0 && i % 6 == 0){
                System.out.print(i + " ");
                count++;
            }if (count == 10){
                System.out.println();
              count = 0;
            }
    }
}}
