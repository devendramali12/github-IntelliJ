package Practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Number:- ");
        int num = sc.nextInt();

        int sum =0;
        while (num!=0){
            int last = num%10;
            sum+=last;
            num = num/10;
        }
        System.out.println("Sum Of Digits Is " + sum);
    }
}
