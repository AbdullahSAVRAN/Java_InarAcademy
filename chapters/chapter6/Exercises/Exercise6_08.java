package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_08 {
    public static void main(String[] args) {
        //Conversions between Celsius and Fahrenheit

        Scanner input = new Scanner(System.in);
        System.out.println("Enter degree in celcius : ");
        double celsius = input.nextDouble();
        System.out.println("Enter degree in fahrenheit : ");
        double fahrenheit = input.nextDouble();
        System.out.println("CELSIUS     FAHRENHEIT        |     FAHRENHEIT       CELSIUS");
        System.out.println("----------------------------------------------------------------");
        for(double i = celsius,j=fahrenheit; celsius >= 31; celsius--,fahrenheit-=10){

            System.out.printf("%-12.1f   %-15.1f|        %-15.1f%-7.2f \n",celsius,celsiusToFahrenheit(celsius),fahrenheit,fahrenheitToCelsius(fahrenheit));

        }

    }
    public static double celsiusToFahrenheit(double celsius){

        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
