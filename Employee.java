public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "John", "Doe", "123 Main St");
        System.out.println("Full Name: " + emp.getFullName());
    }
}
