import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("LowerCase: " + Character.toLowerCase(ch));

        sc.close();
    }
}
