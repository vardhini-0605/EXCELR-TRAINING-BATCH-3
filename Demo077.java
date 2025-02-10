public class Demo077 {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50}; 
        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.print("Copied Array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}