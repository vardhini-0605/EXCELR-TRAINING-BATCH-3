public class Demo064 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 
        
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
        
        System.out.print("Array after swapping first and last elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
