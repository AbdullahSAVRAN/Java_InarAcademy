package chapters.chapter5.Exercises;

public class Exercise5_20 {
    public static void main(String[] args) {
        //Display prime numbers between 2 and 1,000
        int count = 0;

        for (int i = 2; i < 1001; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                count++;

                if (count % 8 == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }   }
        }
    }
}

