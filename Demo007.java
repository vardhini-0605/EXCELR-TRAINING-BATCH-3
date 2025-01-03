import java.util.Scanner;

public class Demo007 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your roll number: ");
        int phonenumber = scanner.nextInt();

        scanner.close();

        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phonenumber);
    }
}
