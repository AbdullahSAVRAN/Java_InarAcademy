package chapters.chapter11;

public class Exercise11_03 {
    public static void main(String[] args) {
        //Subclasses of Account


        Account account = new Account(1290, 50000);
        SavingAccount saving = new SavingAccount(3467, 50000);
        CheckingAccount checking = new CheckingAccount(1928, 50000, -100);
        account.setAnnualInterestRate(2.5);
        saving.setAnnualInterestRate(2.5);
        checking.setAnnualInterestRate(2.5);
        account.withdraw(5000);
        saving.withdraw(5000);
        checking.withdraw(5000);
        account.deposit(2000);
        saving.deposit(2000);
        checking.deposit(2000);
        System.out.println(account.toString());
        System.out.println(saving.toString());
        System.out.println(checking.toString());
    }
}
