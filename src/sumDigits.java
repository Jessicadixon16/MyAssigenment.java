public class sumDigits {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n/= 10;
            }
            return sum;
        }
    }
    public static void main (String [] args) {
        System.out.println(sumDigits(0)); // 0
        System.out.println(sumDigits(1)); // 1
        System.out.println(sumDigits(9)); // 9
        System.out.println(sumDigits(123)); // 6
        System.out.println(sumDigits(456789)); // 39


    }

}
