package Programming;

import java.util.Scanner;

/*
Java Program to Check Armstrong Number (3-digit):

 */
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num!=0){
            int digit = num%10;
            sum += digit*digit*digit;
            num = num/10;
        }
        if (sum==original){
            System.out.println(original +" is an Armstrong number");
        }else {
            System.out.println(original+ " is not an Armstrong number.");
        }

    }
}
