import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("Uppercase: " + Character.toUpperCase(ch));

        sc.close();
    }
}
