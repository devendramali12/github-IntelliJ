package DecisionStatement;

import java.util.Scanner;

//Check if number is even or odd
public class DecisionStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:- ");
        int num = sc.nextInt();



        if (num % 2 == 0){
            System.out.println("Its a Even Number");
        }else {
            System.out.println("Its a Odd Number");
        }
    }
}
