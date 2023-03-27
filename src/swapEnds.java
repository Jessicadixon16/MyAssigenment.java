public class swapEnds {
    public static String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        }
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            String middle = str.substring(1,str.length() -1);
            return last + middle + first;
        }
    }

    public static void main (String [] args) {
        System.out.println(swapEnds("hello")); // output oellh
        System.out.println(swapEnds("codingbat")); // output todingbac
        System.out.println(swapEnds("x")); // output x
        }
    }

