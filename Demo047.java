import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int count = 0;
        int temp = Math.abs(number); 

        
        while (temp > 0) {
            temp /= 10; 
            count++;    
        }

        
        if (number == 0) {
            count = 1;
        }

        System.out.println("The number of digits in " + number + " is: " + count);

        scanner.close();
    }
}
