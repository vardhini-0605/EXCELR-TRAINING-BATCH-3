class StringContainsVowels {    
    public static boolean stringContainsVowels(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

public class Demo026 {
    public static void main(String[] args) {
        System.out.println(StringContainsVowels.stringContainsVowels("Hello")); // true
        System.out.println(StringContainsVowels.stringContainsVowels("TV")); // false
        System.out.println(StringContainsVowels.stringContainsVowels("")); // false
        System.out.println(StringContainsVowels.stringContainsVowels(null)); // false
    }
}
