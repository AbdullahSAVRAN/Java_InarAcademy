package Chapter3.Checkpoints;

public class Checkpoint3_10 {

	public static void main(String[] args) {

		// WE MUST CREATE A VARIABLE 'score'
		double score = 100;
		if (score >= 60.0)
			System.out.println("D");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 90.0)
			System.out.println("A");
		else
			System.out.println("F");

		// The code works but has a logic error

		// if (score >= 90.0) System.out.println("A");
		// else if (score >= 80.0) System.out.println("B");
		// else if (score >= 70.0) System.out.println("C")
		// else if (score >= 60.0) System.out.println("D");
		// This is correct one
	}

}
