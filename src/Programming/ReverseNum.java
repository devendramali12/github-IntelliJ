package Programming;

import java.util.Scanner;

/*
WAP To Reverse The Given Number
 */
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:- ");
        int num = sc.nextInt();

        int reversed = 0;

        while (num !=0){
            int digit = num%10;
            reversed=reversed*10+digit;
            num = num /10;
        }
        System.out.println("Reversed Number:- " + reversed);
    }
}
