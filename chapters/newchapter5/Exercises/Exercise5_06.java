package chapters.newchapter5.Exercises;

public class Exercise5_06 {
    public static void main(String[]args){

        //Conversion from miles to kilometers

        double km = 0;
        double mile1 = 0;
        System.out.println("Miles       Kilometers  |   Kilometers      Miles");
        for (int mile = 1,km1 = 20; mile < 11; mile++,km1+=5){
            km = (mile * 1.609);
            mile1 = (km1 / 1.609);
            System.out.printf("%-15d%6.3f       %-15d%6.3f\n",mile,km,km1,mile1);
        }
    }
}
