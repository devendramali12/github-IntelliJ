package Practice;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = 0;


        System.out.println("Please Enter a number to check Palindrome");
        int num = sc.nextInt();
        int temp = num;

        while (num != 0) {
            int last = num % 10;
            reverse = (reverse * 10) + last;
            num = num / 10;

        }
        if (reverse == temp) {
            System.out.println("The Given Number " + temp + " Is a Palindrome Number");
        } else
            System.out.println("The Given Number " + temp + " Isn't a Palindrome Number");
    }
}
