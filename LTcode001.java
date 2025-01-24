public class LTcode001 {

    
    public static boolean isPalindrome(int x) {
       
        if (x < 0) {
            return false;
        }
        
       
        String str = Integer.toString(x);
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        
        return str.equals(reversedStr);
    }

    
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));  
        
        x = -121;
        System.out.println(isPalindrome(x)); 
        
        x = 10;
        System.out.println(isPalindrome(x));  
        x = 12321;
        System.out.println(isPalindrome(x)); 
}
}