package Loops;

import java.util.Scanner;

// WAP to find factorial of number
public class FactorialOfNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number:- ");
        int num = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= num ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);

    }
}
