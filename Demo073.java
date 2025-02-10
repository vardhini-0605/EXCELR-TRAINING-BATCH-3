public class Demo073 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 4, 6, 9, 10, 5};
        System.out.println("Duplicate elements in the array:");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}