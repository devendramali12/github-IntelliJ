package Java_Part_1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number To Check Palindrome");
        int num = sc.nextInt();

        int temo = num;
        int rev = 0;

        while (num != 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num = num / 10;

        }
        if (temo == rev) {
            System.out.println("The Given Number " + temo + " Is Palindrome");
        } else {
            System.out.println("The Givn Number " + temo + " Isn't Palindrome");
        }
    }
}
