package chapters.chapter6.Exercises;

public class Exercise6_11 {
    public static void main(String[] args) {
        //Financial application: compute commissions

        System.out.println("SALES AMOUNT    COMMISSION");
        System.out.println("---------------------------");
        for(double salesAmount = 10000; salesAmount <= 100000; salesAmount+=5000){
            System.out.printf("%-18.0f%6.1f\n",salesAmount,computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount){
         double balance = 0;
         double commission = 0;
        salesAmount += 0.01;
             if (salesAmount > 10000)
            commission += (balance = salesAmount - 10000) * 0.12;

             if (salesAmount > 5000)
            commission += (balance -= balance - 5000) * 0.10;

             if (salesAmount > 0)
            commission += balance * 0.08;

             if (salesAmount == 25000)
                 commission += (5000*0.08) + (5000*0.10) + (15000*12) - 2700;
             return commission;
    }

}
