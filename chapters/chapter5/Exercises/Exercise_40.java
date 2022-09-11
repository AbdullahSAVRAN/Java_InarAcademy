package chapter5.Exercises;

public class Exercise_40 {

	public static void main(String[] args) {
		//Simulation : heads or tails
		
        int countHeads = 0;
        int countTails = 0;
		
        for (int i = 0; i < 1000000; i++) {
        int number = (int)(Math.random() * 2);
		if (number == 0) {
			countHeads++;
		}else if (number == 1) {
			countTails++;
		}

	}
        System.out.println("Heads : " + countHeads);
        System.out.println("Tails : " + countTails);
}
}