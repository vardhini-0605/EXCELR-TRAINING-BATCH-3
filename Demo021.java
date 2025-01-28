import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter monthly PF: ");
        double pf = scanner.nextDouble();

        double annualSalary = monthlySalary * 12;
        double deductions = (hra + pf) * 12;
        double taxableIncome = annualSalary - deductions;

        double tax = calculateTax(taxableIncome);

        System.out.printf("Annual Taxable Income: Rs %.2f%n", taxableIncome);
        System.out.printf("Total Tax: Rs %.2f%n", tax);

        scanner.close();
    }

    public static double calculateTax(double taxableIncome) {
        double tax = 0;

        if (taxableIncome > 1000000) {
            tax += (taxableIncome - 1000000) * 0.30;
            taxableIncome = 1000000;
        }
        if (taxableIncome > 500000) {
            tax += (taxableIncome - 500000) * 0.20;
            taxableIncome = 500000;
        }
        if (taxableIncome > 0) {
            tax += taxableIncome * 0.10;
        }

        return tax;
    }
}
