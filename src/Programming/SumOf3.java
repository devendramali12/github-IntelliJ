package Programming;
/*
Find the sum of the digits of a number.

Input: 123
Output: 6 (1 + 2 + 3)
 */
import java.util.Scanner;

public class SumOf3 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);

        System.out.println("Enter The 1st Number :-");
        int b = a.nextInt();

        System.out.println("Enter The 2nd Number :-");
        int c = a.nextInt();

        System.out.println("Enter The 3rd Number :-");
        int d = a.nextInt();

        int e = b+c+d;

        System.out.println("The Sum Of The Given 3 Number is :- "+ e );
    }
}
