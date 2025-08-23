package DecisionStatement;
// Find if number is positive, negative or zero

import java.util.Scanner;

public class DecisionStatement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:- ");

        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Its a Positive Number");
        } else if (num < 0) {
            System.out.println("Its a Negative Number");

        }else {
            System.out.println("Its a Zero");
        }

    }
}
