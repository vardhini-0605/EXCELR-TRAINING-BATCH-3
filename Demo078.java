import java.util.Arrays;

public class Demo078 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int[] sortedArray = separateEvenOdd(numbers);
        
        System.out.println("Array with even numbers on left and odd numbers on right:");
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] separateEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] result = new int[arr.length];
        
        for (int num : arr) {
            if (num % 2 == 0) {
                result[left++] = num; 
            } else {
                result[right--] = num; 
            }
        }
        return result;
    }
}