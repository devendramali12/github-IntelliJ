package Programming;

import java.util.Scanner;

// Write a program to count how many even and odd digits are in the number.
public class CountEvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int odd = 0;
        int even = 0;

        // ✅ Special case: when number is 0
        if (num == 0) {
            System.out.println("Please Enter a Valid number:- ");
        } else {
            while (num != 0) {
                int digit = num % 10;

                if (digit % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                num = num / 10;
            }
        }

        System.out.println("Number Of Even digits: " + even);
        System.out.println("Number Of Odd digits: " + odd);
    }
}
