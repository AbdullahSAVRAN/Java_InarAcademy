package chapters.chapter07;

public class Exercise07_13 {
    public static void main(String[] args) {
        //Random number chooser

        System.out.println("Random number is " + getRandom());
    }

    public static int getRandom(int... numbers) {
        int randomInt = (int) (1 + Math.random() * 54);
        return randomInt;

    }
}



