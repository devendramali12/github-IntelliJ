package Programming;

import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number:- ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum =0;
        int odd =0;
        while (a!=0){
            int digit = a%10;
            if (digit%2==0){
                sum+= digit;
            }
            else {
                odd+=digit;

            }

            a=a/10;
        }

        System.out.println("Sum of odd " +odd);
        System.out.println("Sum of the even number:-" + sum);
    }

}
