package Methods;

public class PalindromeCheck {
    public  static  void  check(int num){
        int temp = num;
        int reversed = 0;
        while (num!=0){
            int last = num%10;
            reversed = (reversed*10)+last;
            num = num/10;
        } if (temp == reversed){
            System.out.println( reversed +  " Is a Palindrome");
        }else {
            System.out.println(reversed + " Isn't a Palindrome");
        }
//        System.out.println(temp);
//        System.out.println(reversed);
    }
    public static void main(String[] args) {
        check(1234);
        check(121);

    }
}
