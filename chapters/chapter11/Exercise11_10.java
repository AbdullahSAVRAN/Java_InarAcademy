package chapters.chapter11;

import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        //Implement MyStack using inheritance

        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.print("ENTER THREE STRINGS : ");
        for (int i = 0; i < 3; i++) {
            stack.push(input.next());
        }
        System.out.println(stack.toString());
    }
}

