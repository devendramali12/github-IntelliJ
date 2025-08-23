package Programming;

import java.util.Scanner;

//Write a program to calculate the product of all digits.
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:-");

        int num = sc.nextInt();

        int Product =1;

        while (num!=0){
            int digit=num%10;
            Product *= digit;
            num=num/10;
        }
        System.out.println("Product of number is "+ Product);


    }
}
