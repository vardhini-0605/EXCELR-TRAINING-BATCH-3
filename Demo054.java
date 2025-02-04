public class Demo054 {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo054 demo = new Demo054();

        System.out.println("Sum of two integers: " + demo.add(10, 20));
        System.out.println("Sum of three integers: " + demo.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + demo.add(10.5, 20.5));
    }
}