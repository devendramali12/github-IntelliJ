package MethodtTypes.Typee4;
//Sum Of Digits
public class Type4Example5 {
    public  static  int sum(int a){
        int sum = 0;
        while (a!=0){
            int last = a%10;
            sum = sum + last;
            a = a/10;
        }
        System.out.println("Sum Of Digits is :- " +sum);
        return sum;
    }
    public static void main(String[] args) {
        sum(1234);

    }
}
