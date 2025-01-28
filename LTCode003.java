class LTCode003 {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();
        
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;
        int x4 = 0;
        
        System.out.println("Reversed x1: " + solution.reverse(x1)); // Expected: 321
        System.out.println("Reversed x2: " + solution.reverse(x2)); // Expected: -321
        System.out.println("Reversed x3: " + solution.reverse(x3)); // Expected: 21
        System.out.println("Reversed x4: " + solution.reverse(x4)); // Expected: 0
    }
}
