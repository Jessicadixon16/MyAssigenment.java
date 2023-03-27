public class everyOther {
        public static String everyOther(String str){
                String result = "";
                for (int i = 0; i < str.length(); i += 2){
                        result += str.charAt(i);
                }
                return result;
        }
        //test everyOther method
        public static void main(String[] args){
                System.out.print(everyOther("hello")); // hlo
                System.out.print(everyOther("codingbat")); // cdnbt
                System.out.print(everyOther("abcdefg")); // aceg
                System.out.print(everyOther("")); //
                System.out.print(everyOther("x")); // x
                System.out.print(everyOther("123456789")); // 13579
        }


        }


