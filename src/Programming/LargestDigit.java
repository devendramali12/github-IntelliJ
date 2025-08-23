package Programming;

import java.util.Scanner;

//Write a program to find the largest digit in a given number.
public class LargestDigit {
    public static void main(String[] args) {
        System.out.println("Enter The Digit:- ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = 0;

        if (num == 0) {
            max = 0;
        } else {
            num = Math.abs(num);


            while (num != 0) {
                int digit = num % 10;

                if (digit > max) {
                    max = digit;
                }

                num = num / 10;
            }
        }
        System.out.println("Largest digit is : " + max);
    }
}

