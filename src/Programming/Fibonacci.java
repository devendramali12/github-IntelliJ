package Programming;

import java.util.Scanner;

/*
Java Code to Print Fibonacci Sequence up to n Terms
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt(); // Total number of terms to print

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int third = first + second;  // Calculate next term
            first = second;             // Move first ahead
            second = third;              // Move second ahead
        }
    }
}
