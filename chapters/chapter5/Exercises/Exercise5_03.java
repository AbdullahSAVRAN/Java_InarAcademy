package chapters.chapter5.Exercises;

public class Exercise5_03 {
    public static void main (String[]args){
         //Conversion from kilograms to pounds

         double pound = 0;
        System.out.println("Kilograms      Pounds");
         for (int kg = 1; kg < 200; kg = kg + 2){

             pound = (kg * 2.2);
             System.out.printf("%-15d%6.1f\n", kg,pound);
         }


    }


}
