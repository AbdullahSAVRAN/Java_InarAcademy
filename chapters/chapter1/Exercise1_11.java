package chapter1;

public class Exercise1_11 {

	public static void main(String[] args) {

		int Population = 312032486;

		// one day has 24 * 60 * 60 seconds
		int OneDaySeconds = 24 * 60 * 60;
		// one year has 365 * OneDaySeconds seconds
		int OneYear = 365 * OneDaySeconds;
		int TotalBirth = OneYear / 7;
		int TotalDeath = OneYear / 13;
		int TotalImmigrant = OneYear / 45;
		int FirstYear = Population + TotalBirth - TotalDeath + TotalImmigrant;
		System.out.println("Population of FIRST year  : " + FirstYear);
		int SecondYear = FirstYear + TotalBirth - TotalDeath + TotalImmigrant;
		System.out.println("Population of SECOND year  : " + SecondYear);
		int ThirdYear = SecondYear + TotalBirth - TotalDeath + TotalImmigrant;
		System.out.println("Populatin of THIRD year  : " + ThirdYear);
		int FourthYear = ThirdYear + TotalBirth - TotalDeath + TotalImmigrant;
		System.out.println("Population of FOURTH year  : " + FourthYear);
		int FifthYear = FourthYear + TotalBirth - TotalDeath + TotalImmigrant;
		System.out.println("Population of FIFTH year  : " + FifthYear);

	}

}
