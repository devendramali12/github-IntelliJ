package Programming;

import java.util.Scanner;

/*
Write a program to check whether a number entered by the user is prime or not.

Input: 7
Output: Prime number

 */
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;
        }else {
            for (int i = 2; i < i -1 ; i++) {
                if(n % i ==0){
                    isPrime = false;
                    break;

                }
            }
        }
        if(isPrime){
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

        sc.close();
    }
}
