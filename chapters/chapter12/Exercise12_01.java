package chapters.chapter12;

public class Exercise12_01 {
    public static void main(String[] args) {
        //NumberFormatException


        if (args.length != 3) {
            System.out.println("Usage: java operand1 operator operand2");
            System.exit(1);
        }
        int result = 0;
        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("WRONG INPUT : " + args[0] + args[1] + args[2]);
        }
    }
}