public class Demo067 {
    public static void main(String[] args) {
       
        int[] numbers = {10, 21, 30, 41, 50};

        System.out.println("Even elements in the array:");
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}