public class PartTimeEmployee {
    private int hoursWorked;
    private double amountPerHour;

    public PartTimeEmployee() {
        this.hoursWorked = 0;
        this.amountPerHour = 0.0;
    }

    public PartTimeEmployee(int hoursWorked, double amountPerHour) {
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    public void showDetails() {
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount Per Hour: " + amountPerHour);
        System.out.println("Total Salary: " + computeSal());
    }

    public static void main(String[] args) {
        PartTimeEmployee emp1 = new PartTimeEmployee(20, 15.5);
        emp1.showDetails();
    }
}