package chapters.newchapter5.Exercises;

public class Exercise5_42 {
    public static void main(String[] args) {
        //Financial application: find the sales amount

        double target = 30000;
        double balance;
        double commission = 0;
        double salesAmount;
        for (salesAmount = 0.01; commission < target; salesAmount += 0.01) {
            balance = 0;
            commission = 0;
            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.12;
            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.10;
            if (salesAmount > 0)
                commission += balance * 0.08;
            if (salesAmount == 25000)
                commission += (5000 * 0.08) + (5000 * 0.10) + (15000 * 12) - 2700;
        }
        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
    }
}
