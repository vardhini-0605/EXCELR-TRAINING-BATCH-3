public class Demo019 {
    public static int roundToNearestFive(int num) {
        return (int) (Math.round(num / 5.0) * 5);
    }

    public static void main(String[] args) {
        int num = 47;
        System.out.println("Original: " + num);
        System.out.println("Rounded: " + roundToNearestFive(num));
    }
}