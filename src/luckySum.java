public class luckySum {
    public static int luckySum(int a, int b, int c){
        if (a == 13) {
            return 0;
        }
        else if (b ==13) {
            return a;
        }
        else if (c ==13) {
            return a + b;
        }
        else {
            return a + b + c;
        }
    }
    public static void main(String[] args){
        System.out.println(luckySum(1,2,3)); // expected sum = 6
        System.out.println(luckySum(1,2,13)); //  expected sum = 3
        System.out.println(luckySum(1,13,3)); // expected sum = 1
    }
}
