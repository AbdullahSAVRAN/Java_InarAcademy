package chapters.newchapter5.Exercises;


import java.util.Scanner;

public class Exercise5_36 {
    public static void main(String[] args) {
        //Business: check ISBN-10

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digit :");
        String s = input.nextLine();
        int l = s.length();
        int digitTen = 0;
        for (int i = 0; i < l ; i++){
              digitTen +=Integer.parseInt(s.charAt(i) + "") * (i + 1);

              }
              digitTen = digitTen % 11;if(digitTen == 10){
            System.out.println("The ISBN : " + s + "X");}
            else{
                System.out.println("The ISBN : " + s + digitTen);
            }
        }

    }


