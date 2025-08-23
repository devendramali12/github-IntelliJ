package Programming;

import java.util.Scanner;

//Java program to calculate the factorial of a number
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:- ");
        int n = sc.nextInt();

        long fact = 1;
        //use long for handle large results

        for (int i = 1; i <=n ; i++) {
            fact= fact*i;

        }
        System.out.println("Factorial of " + n + " is:- " + fact);
    }
}
