public class fibonacci {
    public static int fibonacci(int n) {
        // if n is 0, return 0
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        }
        else if (n == 0) {
            return 0;
        }
        // if n is 1, return 1
        else if (n == 1) {
            return 1;
        }
        // use a loop to calculate the fibonacci seqence
        else {
            int a = 0;
            int b = 1;
            // loop updating term as the sum of two
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            //return b which is fibonacci term in sequence
            return b;
        }
        }
        public static void main(String[] args) {
        // testing fibonacci method with inputs
        int n0 = 0;
        int n1 = 1;
        int n2 = 2;
        // resulting output
        System.out.println("fibonacci (" + n0 + ") = " + fibonacci(n0));
        System.out.println("fibonacci (" + n1 + ") = " + fibonacci(n1));
        System.out.println("fibonacci (" + n2 + ") = " + fibonacci(n2));
        }

    }
