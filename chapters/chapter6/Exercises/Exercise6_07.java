package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_07 {
    public static void main(String[] args) {
        //Financial application: compute the future investment value

        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment value :");
        double investmentValue = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage : ");
        double AnnualInterestRate = input.nextDouble();
        double MonthlyInterestRate = AnnualInterestRate / 1200;

        System.out.println("YEARS        FUTURE VALUE");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%d             %.2f\n", years, futureInvestmentValue(investmentValue,MonthlyInterestRate,years));
        }

    }
    public static double futureInvestmentValue(double investmentValue,double monthlyInterestRate,int years){
             return investmentValue * Math.pow((1 + monthlyInterestRate), years * 12);

       }

   }





