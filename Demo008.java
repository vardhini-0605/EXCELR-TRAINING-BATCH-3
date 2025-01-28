import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";
        boolean isLoggedIn = false;

        System.out.println("Welcome to Malla Reddy University");

        do {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                isLoggedIn = true;
                System.out.println("Logged in successfully!");
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        } while (!isLoggedIn);

        scanner.close();
    }
}
