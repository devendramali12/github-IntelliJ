package DecisionStatement;
//Find the largest of two numbers

import java.util.Scanner;

public class GreatOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "Is greater");
        } else System.out.println(num2 + " Is Greater");
    }
}
