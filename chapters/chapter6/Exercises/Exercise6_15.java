package chapters.chapter6.Exercises;

public class Exercise6_15 {
    public static void main(String[] args) {
       //Financial application: print a tax table

        double start = 50000;
        double end = 60000;
        double interval = 50;

        System.out.println("Taxable      Single      Married Joint       Married        Head of\n" +
                        "Income                   or Qualifying       Separate       a House\n" +
                        "                         Widow(er)\n" +
                        "---------------------------------------------------------------------");
        for (double taxableIncome = start;
             taxableIncome <= end; taxableIncome += interval) {
            System.out.printf("%-13.0f", taxableIncome);
            System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
            System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
            System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
            System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
        }
    }

    public static double computeTax(int status,double taxableIncome){
        double tax,incomeTax,taxRate,incomeUntax,tax15,tax25,tax28,tax33,tax35;
        tax = taxRate = tax15 = tax25 = tax28 = tax33 = tax35 = incomeUntax = 0;

        switch (status){
            case 0 :
            tax15 = 8351;
            tax25 = 33951;
            tax28 = 82251;
            tax33 = 151551;
            tax35 = 322951;
            break;
            case 1 :
                tax15 = 16701;
                tax25 = 67901;
                tax28 = 137051;
                tax33 = 208851;
                tax35 = 372951;
                break;
            case 2 :
                tax15 = 8351;
                tax25 = 33951;
                tax28 = 68526;
                tax33 = 104426;
                tax35 = 186476;
            case 3 :
                tax15 = 11951;
                tax25 = 45501;
                tax28 = 117451;
                tax33 = 190201;
                tax35 = 372951;
        }
        while (taxableIncome >= tax15){
            if (taxableIncome >= tax35){
                taxRate = 0.35;
                incomeUntax = tax35 - 1;
            }
            else if (taxableIncome >= tax33){
                taxRate = 0.33;
                incomeUntax = tax33 - 1;
            }
            else if (taxableIncome >= tax28){
                taxRate = 0.28;
                incomeUntax = tax28 - 1;
            } else if (taxableIncome >= tax25) {
                taxRate = 0.25;
                incomeUntax = tax25 - 1;
            }
            else if (taxableIncome >= tax15){
                taxRate = 0.15;
                incomeUntax = tax15 - 1;
            }
            tax += (incomeTax = taxableIncome - incomeUntax) * taxRate;
            taxableIncome -= incomeTax;
        }
        return tax += taxableIncome * 0.10;
    }
}
