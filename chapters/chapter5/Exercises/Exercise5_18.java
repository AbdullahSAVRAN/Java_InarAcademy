package chapter5.Exercises;

public class Exercise5_18 {

	public static void main(String[] args) {
          // Display four patterns using loops
		
		  String number1 = "";
		  String number = "";
		  for (int i = 1; i <7; i++)
		  {
			  number += " " + i;
			  System.out.println(number);
		  }
		  int x = 0;
	        for (int i = 0; i < 6; i++) {
	            for (int j = 1; j < 7 - x; j++) {
	                System.out.print(" " + j);
	            }
	            System.out.println();
	            x++;
	}
	        for (int i = 1; i <= 6; i++) {

	            for (int j = 6 - i; j >= 1; j--) {
	                System.out.print(" ");
	            }
	            for (int z = i; z >= 1; z--) {
	                System.out.print(z);
	            }
	            System.out.println();
	        
	}
	        for (int i = 0; i < 6; i++) {

	            for (int z = 0; z < i; z++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 6 - i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        }
}
