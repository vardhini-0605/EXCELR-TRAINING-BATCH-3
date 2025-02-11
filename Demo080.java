import java.util.Scanner;

public class Demo080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int firstElement = arr[0];
        
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        
        arr[n - 1] = firstElement;  
        
        System.out.println("Array after shifting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}