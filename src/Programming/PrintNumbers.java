package Programming;

import java.util.Scanner;

// printing numbers from 1 to N using a for loop.
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number N:- ");
        int n = sc.nextInt();

        for (int i = 0; i <= n ; i++) {
            System.out.println(i);

        }
    }
}
