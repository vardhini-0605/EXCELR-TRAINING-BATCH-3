
import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        if (minutes < 0) {
            System.out.println("Error: Minutes cannot be negative.");
        } else {
            long minutesInYear = 525600;
            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / 1440;

            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        }
        scanner.close();
    }
}
