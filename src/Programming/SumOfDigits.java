package Programming;

import java.util.Scanner;

/*
Write a program to find the sum of all digits in a given number.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number :- ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum =0;

        while(num!=0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        System.out.println("Sum of digits "+ sum);
    }
}
