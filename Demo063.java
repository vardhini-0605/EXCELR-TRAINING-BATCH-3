public class Demo063 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 
        
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        
        int sum = numbers[0] + numbers[numbers.length - 1];
        System.out.println("Sum of first and last element: " + sum);
    }
}
