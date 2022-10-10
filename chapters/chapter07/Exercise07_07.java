package chapters.chapter07;

public class Exercise07_07 {
    public static void main(String[] args) {
        //Count single digits

        int[] count = new int[10];
        for (int i = 1; i <= 100; i++) {
            count[(int)(Math.random() * 10)]++;
        }
        System.out.println("Result : ");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + " : " + count[i]);
        }
    }
}
