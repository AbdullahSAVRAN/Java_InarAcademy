package chapters.chapter5.Exercises;

public class Exercise5_18 {
    public static void main(String[] args) {
        //Display four patterns using loops

         patternA();
         patternB();
         patternC();
         patternD();
    }

    public static void patternA() {
        System.out.println("Pattern A");
        int x = 1;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(j);
            }
            System.out.println();
            x++;
        }


    }
    public static void patternB(){
        System.out.println("Pattern B");
        int x = 1;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 7 - x; j++) {
                System.out.print(j);
            }
            System.out.println();
            x++;
        }
}
     public static void patternC(){

          System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++){
            for(int j = 6 - i; j>=1; j--){
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--){
                System.out.print(k);
            }
            System.out.println();
    }}
    public static void patternD(){
        System.out.println("Pattern D");

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=6 - i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
