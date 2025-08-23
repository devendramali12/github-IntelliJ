package DecisionStatement;
// Check if a number is positive or negative

import java.util.Scanner;

public class DecisionStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter a Number to check whether it is positive or Negative:- ");
        int num = sc.nextInt();

        if (num>=0){
            System.out.println("Its a Posiitive Number");
        } else {
            System.out.println("Its a Negative");
        }
    }
}
