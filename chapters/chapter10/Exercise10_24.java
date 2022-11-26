package chapters.chapter10;

public class Exercise10_24 {
    public static void main(String[] args) {
        //Implement the Character class


        MyCharacter one = new MyCharacter('q');
        MyCharacter two = new MyCharacter('W');
        MyCharacter three = new MyCharacter('3');

        System.out.println("IS LETTER(q) ? : " + MyCharacter.isLetter('q'));
        System.out.println("IS DIGIT(q) ? : " + MyCharacter.isDigit('q'));
        System.out.println("IS LOWER CASE(q) ? : " + MyCharacter.isLowerCase('q'));
        System.out.println("TO UPPER CASE(q) ? : " + MyCharacter.toUpperCase('q') + "\n");

        System.out.println("IS LETTER(W) ? : " + MyCharacter.isLetter('W'));
        System.out.println("IS DIGIT(W) ? : " + MyCharacter.isDigit('W'));
        System.out.println("IS UPPER CASE(W) ? : " + MyCharacter.isUpperCase('W'));
        System.out.println("TO LOWER CASE(W) ? : " + MyCharacter.toLowerCase('W') + "\n");


        System.out.println("IS LETTER(3) ? : " + MyCharacter.isLetter('3'));
        System.out.println("IS DIGIT(3) ? : " + MyCharacter.isDigit('3'));


    }
}
