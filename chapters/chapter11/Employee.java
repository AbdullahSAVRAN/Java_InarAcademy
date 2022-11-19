package chapters.chapter11;

public class Employee extends Person{
    private double officeSalary;


    public Employee() {
        super();

        officeSalary = 0;
    }

    public Employee(String name, String adress, String phoneNumber, String emailAdress) {
        super(name, adress, phoneNumber, emailAdress);

        officeSalary = 0;
    }

    public Employee(String name, String adress, String phoneNumber, String emailAdress, double officeSalary) {
        super(name, adress, phoneNumber, emailAdress);
        this.officeSalary = officeSalary;

    }

    public double getOfficeSalary() {
        return officeSalary;
    }

    public void setOfficeSalary(double officeSalary) {
        this.officeSalary = officeSalary;
    }

    public String toString() {
        return super.toString() + " " + "Employee{" + "officeSalary=" + officeSalary + " Date is : ";
    }
}
