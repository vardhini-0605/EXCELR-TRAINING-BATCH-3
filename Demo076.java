public class Demo076 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 47, 3, 99, 56, 74}; 

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found.");
        } else {
            System.out.println("Second maximum number in the array: " + secondMax);
        }
    }
}