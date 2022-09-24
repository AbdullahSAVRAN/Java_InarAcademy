package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_02 {
         public static void main (String[]args){
            //Repeat additions

             Scanner input = new Scanner(System.in);
             long startTime = System.currentTimeMillis();
             int answer ;
             int number1 ;
             int number2 ;
             int sub = -1;
             int correct = 0;
             for (int i = 1; i < 11; i++) {
                 number1 = (int) (1 + Math.random() * 16);
                 number2 = (int) (1 + Math.random() * 16);
                 System.out.printf("What is %d - %d  ?  : ",number1,number2);
                 answer = input.nextInt();
                 sub = number1 - number2;

                 if (answer == sub) {
                     correct++;
                 }
             }
              long finishTime = System.currentTimeMillis();
             long time = finishTime - startTime;
             System.out.println("Correct answer : " + correct);
             System.out.println("System time is : " + time);
             }

         }
