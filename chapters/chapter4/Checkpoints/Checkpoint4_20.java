package chapter4.Checkpoints;

public class Checkpoint4_20 {

	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = "welcome";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.startsWith("AAA"));
		System.out.println(s1.endsWith("AAA"));
		int x = s1.length();
		System.out.println(x);

		String s3 = s1.concat(s2);
		System.out.println(s3);

		String s4 = s1.toLowerCase();
		System.out.println(s4);

		String s5 = s1.toUpperCase();
		System.out.println(s5);

		String s6 = "  Hello World  ";

		System.out.println("\t Hello World \t".trim());

	}

}
