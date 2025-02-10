public class Demo075 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 47, 3, 99, 56, 74}; 

        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("Maximum number in the array: " + max);
    }
}