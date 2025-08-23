package Programming;

import java.util.Scanner;

/*
Check Palindrome Number
Check whether the number is a palindrome (reads the same backward).

Input: 121
Output: Palindrome
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        int original = num; //Store the original number

        int reversed =0;

        while (num!=0){
            int digit = num%10;
            reversed= reversed*10+digit;
            num = num/10;
        }
        if (original==reversed){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
