public class Demo069 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50,};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}