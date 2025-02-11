import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to find: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }
}