package MethodtTypes.Typee4;
// reverse a num
public class Type4Example4 {
    public  static  int reverse (int a ){
        int rev = 0;
        while (a!=0){
            int last = a%10;
            rev = (rev*10)+last;
            a= a/10;
        }
        System.out.println(rev);
        return rev;
    }
    public static void main(String[] args) {
        reverse(1234);
        reverse(5896);

    }
}
