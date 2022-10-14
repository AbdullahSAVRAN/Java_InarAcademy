package chapters.chapter07;

public class Exercise07_06 {
    public static void main(String[] args) {
        //Revise Listing 5.15, PrimeNumber.java

        int count = 0;
        int number = 2;
        System.out.println(" THE FIRST 50 PRIME NUMBER  \n");
        System.out.println("------------------------------");
        while (count < 50) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
