package chapters.chapter09;

public class Exercise09_07 {
    public static void main(String[] args) {
        //The Account class

        Account account = new Account(1000, 50000);
        account.setAnnualInterestRate(2.5);
        account.withdraw(1000);
        account.deposit(2000);
        System.out.println("ID : " + account.getId());
        System.out.println("DATE : " + account.getDateCreated());
        System.out.println("BALANCE : " + account.getBalance());
        System.out.println("MONTHLY INTEREST : " + account.monthlyInterest());
    }
}
