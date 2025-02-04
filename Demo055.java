public class Demo055 {

    public static int sumOfSquares(int number) {
        int sum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int number = 123;
        
        int result = sumOfSquares(number);
        
        System.out.println("Sum of squares of the digits of " + number + " is: " + result);
    }
}