import java.util.Scanner;
class Customer{
    String Cust_Name = "User";
    long Account_no = 123456;
    Double Balance = 10000.00;
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        Cust_Name = sc.nextLine();
        System.out.print("Enter Your Account Number: ");
        Account_no = sc.nextLong();
        sc.close();
    }
    void Display_details(){
        System.out.println("Hello "+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
}
public class Demo010 {
    
    public static void main(String[] args){
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}