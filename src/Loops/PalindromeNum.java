package Loops;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter A Number To Check Palindrome :- ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;

        }
        if (temp == rev) {
            System.out.println(rev + " Number is Palindrome Number");
        } else {
            System.out.println( "The Given Number Isn't Palindrome Number");
        }
    }
}
