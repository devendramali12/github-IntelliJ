package Programming;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter The Number:- ");

        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
if (ab%2==0) {
    System.out.println("Number is Even & Divisible by 2");
}
else {
    System.out.println("Number is Odd &  Not " +
            "Divisible by 2");
}

        }
    }

