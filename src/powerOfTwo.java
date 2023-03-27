public class powerOfTwo {
    // this method takes a non-negative int n and returns it true if it is the power of 2
    // return false if otherwise
    public static boolean powerOfTwo(int n){
        // 0 is not a power of 2
        if( n==0){
            return false;
        }
        else {
            // divide n by 2 until it cant
            do{
                // if n is odd, it is not a power of 2
                if(n == 1) {
                    return true;
                }
                else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            }
            while (true);
            // n is the power of 2
        }

        }
        // testing output of powerOfTwo method with inputs
        public static void main(String[] args){
        System.out.println(powerOfTwo(0));
        System.out.println(powerOfTwo(1));
        System.out.println(powerOfTwo(2));
        System.out.println(powerOfTwo(12));
        System.out.println(powerOfTwo(1024));

        }
    }

