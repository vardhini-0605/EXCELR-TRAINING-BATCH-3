public class Demo070 {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 30, 47, 50,};
        
        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
