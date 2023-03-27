public class reverseDoubleChar {
    public static String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {

            result += word.charAt(i) + "" + "" + word.charAt(i);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverseDoubleChar("The")); // eehhTT
        System.out.println(reverseDoubleChar("AABB")); // BBBBAAAA
        System.out.println(reverseDoubleChar("String")); // ggnniirrttSS
    }
}






