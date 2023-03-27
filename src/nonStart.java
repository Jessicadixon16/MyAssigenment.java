public class nonStart {
    public static String nonStart(String a, String b){
        // if string is empty, return empty string
        if (a.length() < 2 || b.length() < 2) {
            return "";
        }
        // join substrings  and return the result!
        return a.substring(1) + b.substring(1);
    }

    public static void main (String [] args) {
        // test the nonStart method
        System.out.println(nonStart("Hello", "There")); //"ellohere
        System.out.println(nonStart("coding", "bat")); //"odingat
        System.out.println(nonStart("a", "b")); //""
    }
}
