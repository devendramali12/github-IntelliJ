package Programming;
/*
 Swap Two Numbers Without Third Variable
Swap two numbers without using a third variable.

Input: a = 10, b = 5
Output: a = 5, b = 10

 */
import java.util.Scanner;

public class SwapNum2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = c.nextInt();

        System.out.println("Enter the second number");
        int b = c.nextInt();


        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping the numbers ");
        System.out.println("First Number "+a);
        System.out.println("Second number "+b);

    }
}
