public class PS004 {
    private double basePay;
    private int hoursWorked;

    public PS004(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public PS004() {
        this.basePay = 8.00;
        this.hoursWorked = 40;
    }

    public void computeSalary() {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay cannot be less than $8.00");
        } else if (hoursWorked > 60) {
            System.out.println("Error: Hours worked cannot exceed 60 hours");
        } else {
            double totalPay = 0;
            if (hoursWorked > 40) {
                totalPay = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
            } else {
                totalPay = hoursWorked * basePay;
            }
            System.out.println("Total Pay: $" + totalPay);
        }
    }

    public static void main(String[] args) {
        PS004 employee1 = new PS004(7.50, 35);
        PS004 employee2 = new PS004(8.20, 47);
        PS004 employee3 = new PS004(10.00, 3);

        employee1.computeSalary();
        employee2.computeSalary();
        employee3.computeSalary();
    }
}
