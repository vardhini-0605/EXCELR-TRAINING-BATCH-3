import java.util.Scanner;

public class Demo082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in first array: ");
        int n1 = scanner.nextInt();
        
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of elements in second array: ");
        int n2 = scanner.nextInt();
        
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        System.out.println("Elements of the first array:");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println("\nElements of the second array:");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        scanner.close();
    }
}