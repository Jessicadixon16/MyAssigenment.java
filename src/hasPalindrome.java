public class hasPalindrome {
    // method to check if given string is palindrome
    public static boolean hasPalindrome(String str) {
        // removing non- alphamumeric characters and change to lower case
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {

            int left = i - 1;
            int right = i + i;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }
    // main method to test palindrome
    public static void main(String[] args) {
        System.out.println(hasPalindrome("level"));
        System.out.println(hasPalindrome("A man, a plan, a canal: Panama!"));
        System.out.println(hasPalindrome("Radar"));

    }
}


