package chapters.chapter5.Exercises;

public class Exercise5_11 {
    public static void main(String[] args) {
        //Find numbers divisible by 5 or 6, but not both
        int count = 0;

        for (int i = 100; i <1001; i++){
            if (!(i % 5 == 0 && i % 6 == 0) && (i % 5 == 0 || i % 6 == 0)){
                System.out.print(i + " ");
                count++;
            }if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
