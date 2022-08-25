package Chapter3.exercises;

public class Exercises3_10 {

	public static void main(String[] args) {
		// Game : addition quiz

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		int add = number1 + number2;
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("The add of two integers : " + add);

	}

}
