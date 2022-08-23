package chapter0_2.checkpoints0_2;

public class checkpoint2_7 {

	public static void main(String[] args) {
		
	final int SIZE = 20;
	
	System.out.println("Size : " + SIZE);
	//Benefit of using constants is their unchangeable structure.When we need them in code we can use them as same value 
	
	SIZE++;  //This line is wrong because of SIZE is a unchangeable variable,we declare it as a final int
	System.out.println("Size : " + SIZE);
	
	}

}
