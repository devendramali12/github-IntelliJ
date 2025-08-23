package Programming;

import java.util.Scanner;

//a simple program to calculate the sum of first N natural numbers using a for loop.
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:- ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <n ; i++) {
            sum += i;


        }
        System.out.println("The Sum of first " +n + " number is " + sum);
    }
}
