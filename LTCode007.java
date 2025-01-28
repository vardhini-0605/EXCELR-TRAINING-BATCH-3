class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

public class LTCode007 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        printArray(result1); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        printArray(result2); // Output: [4, 3, 2, 2]

        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        printArray(result3); // Output: [1, 0]
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


