package Practice;

import java.util.Scanner;

public class ArmmStrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number:- ");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;

        while (num != 0) {
            int last = num % 10;
            sum += last * last * last;
            num = num / 10;

        }
        if (sum == temp) {
            System.out.println(sum + " Is a Armstrong Number");
        } else {
            System.out.println(sum + " Isn't Armstrong Number");
        }
    }
}
