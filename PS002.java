import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("-1");
        } else {
            int nextMultipleOf100 = ((number / 100) + 1) * 100;
            System.out.println("Next multiple of 100 is: " + nextMultipleOf100);
        }
        scanner.close();
    }
}
