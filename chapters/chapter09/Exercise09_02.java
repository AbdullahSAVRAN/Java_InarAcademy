package chapters.chapter09;

public class Exercise09_02 {

    public static void main(String[] args) {
        //The Stock class

        Stock stock = new Stock("System", "java project");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("\nStock name: " + stock.name);
        System.out.println("Stock symbol: " + stock.symbol);
        System.out.printf("Price-change percentage: %.2f%%\n", stock.getChangePercent());
    }
}
