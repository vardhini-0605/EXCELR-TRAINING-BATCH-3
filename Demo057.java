public class Demo057 {
    public static int sumOfFirstAndLastDigits(int number) {
        int lastDigit = number % 10;
        int firstDigit = number;       
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }        
        return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        int number = 12345;       
        int result = sumOfFirstAndLastDigits(number);
        System.out.println("Sum of first and last digits of " + number + " is: " + result);
    }
}