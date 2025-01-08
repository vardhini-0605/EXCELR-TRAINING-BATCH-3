public class Demo020 {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}