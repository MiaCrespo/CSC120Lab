import java.util.Scanner;

public class TaxTime {

    //initialize constants
    private static final double Stinking_Rich = 500000;
    private static final double Quite_Rich = 200000;
    private static final double Miami_Poor = 100000;
    private static final double Average = 50000;
    private static final double Realistic = 20000;
    private static final double Poor = 20000;
    private static final double High_Rate = 0.25;
    private static final double Medium_Rate = 0.1;
    private static final double Low_Rate = 0.03;

    public static void main(String[] args) {
        // Initialize variables
        double totalIncome = 0.0;
        double totalDeductions = 0.0;
        double taxableIncome = 0.0;
        char taxGroup = ' ';
        double taxOwed = 0.0;

        Scanner scanner = new Scanner(System.in);
        double amount;
        do {
            System.out.print("Enter next amount : ");
            amount = scanner.nextDouble(); //1.1.2 Input value
            if (amount > 0) { //1.1.3 If positive
                totalIncome += amount;
            } else if (amount < 0) { //1.1.4 If negative
                totalDeductions += Math.abs(amount); // 1.1.4.1 Add (absolute) to deduction
            }
        } while (amount != 0);


        taxableIncome = computeTaxableIncome(totalIncome, totalDeductions); // 2. Compute taxable income

        taxGroup = determineTaxGroup(taxableIncome); // 3. Determine tax group

        taxOwed = computeTax(taxableIncome, taxGroup); // 4. Compute tax

        displayOutput(totalIncome, totalDeductions, taxableIncome, taxGroup, taxOwed); // 5. Display tax information
    }



    // method 1: 2. compute taxable income
    public static double computeTaxableIncome(double income, double deduction) {
        if (income >= deduction) { //2.1 If income >= deduction then taxable is income - deduction, else
            return income - deduction;
        } else {
            return 0.0; //2.2 Taxable is 0.0
        }
    }

    // method 2: 3. compute tax group
    public static char determineTaxGroup(double taxableIncome) {
        if (taxableIncome >= Stinking_Rich) { // 3.1 If taxable >= 500000
            return 'S'; // Greater or equal to $500000 = Stinking rich
        } else if(taxableIncome >= Quite_Rich){ //  3.2 If taxable >= 200000
            return 'Q'; // Greater or equal to $200000 = Quite rich
        } else if (taxableIncome >= Miami_Poor) { //  3.3 If taxable >= 100000
            // 3.3.1 Group is M, else
            return 'M'; // Greater or equal to $100000 = Miami poor
        } else if (taxableIncome >= Average) { //3.4 If taxable >= 50000
            // 3.4.1 Group is A, else
            return 'A'; // Greater or equal to $50000 = Average
        } else if (taxableIncome >= Realistic) { //3.5 If taxable >= 20000

            return 'R'; // Greater or equal to $20000 = Realistic
        } else { // 3.5.1 Group is R, else
            return 'P'; //3.6 Group is P
            // Less than $20000 = Poor
        }
    }

    // method 3: 4. compute tax
    public static double computeTax(double taxableIncome, char taxGroup) {
        if (taxGroup == 'S' || taxGroup == 'Q') {
            return taxableIncome * High_Rate; // 4.1.1.1 Tax is 25% of taxable
        } else if (taxGroup == 'M') {
            return taxableIncome * Medium_Rate; //  4.1.2.1 Tax is 10% of taxable
        } else if (taxGroup == 'A' || taxGroup == 'R') {
            return taxableIncome * Low_Rate; // 4.1.3 Tax is 3% of taxable
        } else {
            return 0.0; // No tax for Poor
        }
    }

    // method 4: display tax income
    public static void displayOutput(double income, double deduction, double taxableIncome, char taxGroup, double taxOwed) {
        System.out.println();
        System.out.println("Income         =  $" + income); // 5.1 Display income
        System.out.println("Deductions     = $" + deduction); // 5.2 Display deduction
        System.out.println("Taxable income = $" + taxableIncome); // 5.3 Display taxable
        System.out.println("Tax group      =  " + taxGroup); // 5.4 Display group
        System.out.println("Tax owed       = $" + taxOwed); // 5.5 Display tax
    }
}