package chapter5.Exercises;

public class Exercise5_15 {

	public static void main(String[] args) {
         //Display the ASCII character table
		
		int count = 0;
		char code2 = '~';
		for (char code = '!'; code < code2; code++) {
			System.out.print(code + " ");
			count++;

			if (count == 10) {
				System.out.println(" ");
				count = 0;
			}
		}
	}

}
