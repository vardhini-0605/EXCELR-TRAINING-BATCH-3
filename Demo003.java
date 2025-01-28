import java.util.Scanner;

public class Demo003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println(num3 + " is the greatest.");
        }
    }
}
