package Loops;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact = 1;

        System.out.println("Please Enter a Number To Get a Factorial :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);

    }
}
