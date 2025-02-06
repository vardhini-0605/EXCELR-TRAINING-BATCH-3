public class Demo068 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 32, 20, 25, 30, 35};
        int evenCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Total even numbers in the array: " + evenCount);
    }
}