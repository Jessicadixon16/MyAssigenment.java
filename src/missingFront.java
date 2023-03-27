public class missingFront {
    public static String missingFront(String str) {
        return str.substring(3);
        }




    public static void main(String [] args) {
    System.out.println(missingFront("abcd"));// output d
        System.out.println(missingFront("Holiday")); // output iday
        System.out.println(missingFront("House")); //output se
        }
}


