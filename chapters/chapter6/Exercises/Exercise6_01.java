package chapters.chapter6.Exercises;

public class Exercise6_01 {
    public static void main(String[] args) {
        //Math: pentagonal numbers

        System.out.println("                        THE FIRST 100 PENTAGONAL NUMBER  ");
      for (int i = 1; i<= 100; i++){
          if(i % 10 == 0){
              System.out.printf("%7d\n",getPentagonalNumber(i));
          }else{
              System.out.printf("%7d",getPentagonalNumber(i));
          }
      }

    }

    public static int getPentagonalNumber(int n){
         return  (n * ((3 * n) -1))/2;

    }
}
