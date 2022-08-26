package Chapter3.exercises;
import java.util.Scanner;
public class Exercises3_32 {

	public static void main(String[] args) {
		// Geometry : point position
		
		    Scanner input = new Scanner(System.in);
	        System.out.println("Enter three sets of coordinates for the points p0, p1, p2 : ");

	        double x0 = input.nextDouble();
	        double y0 = input.nextDouble();
	        double x1 = input.nextDouble();
	        double y1 = input.nextDouble();
	        double x2 = input.nextDouble();
	        double y2 = input.nextDouble();

	        double determinant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	        String beg = "(" + x2 + "," + y2 + ") is ";
	        String end = " line from " + "(" + x0 + "," + y0 + ") to " + "(" + x1 + "," + y1 + ")";
	        String det = "";

	        if (determinant > 0) {

	            det += "on the left side of the";
	        } else if (determinant < 0) {
	            det += "on the right side of the";

	        } else if (determinant == 0) {
	            det += "on the same line as the";
		

	}
	        System.out.println(beg + det + end);
	        
	}
}