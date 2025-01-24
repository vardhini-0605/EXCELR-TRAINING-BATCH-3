public class LTcode003 {

    
    public static int myAtoi(String s) {
       
        if (s == null || s.length() == 0) {
            return 0;
        }

        
        s = s.trim();

       
        if (s.length() == 0) {
            return 0;
        }

       
        int i = 0, sign = 1, result = 0;
        int len = s.length();

        
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        
        while (i < len && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    
    public static void main(String[] args) {
       
        String s1 = "42";
        System.out.println(myAtoi(s1));  
        
        String s2 = "   -42";
        System.out.println(myAtoi(s2));  
        
        String s3 = "4193 with words";
        System.out.println(myAtoi(s3));  
        
        String s4 = "words and 987";
        System.out.println(myAtoi(s4)); 
        
        String s5 = "-91283472332";
        System.out.println(myAtoi(s5));  
    }
}
