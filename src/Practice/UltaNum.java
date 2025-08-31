package Practice;

import java.util.Scanner;

public class UltaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;

        System.out.println("Please Enter a Number:- ");
        int num = sc.nextInt();

        while (num != 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num = num / 10;

        }
        System.out.println("Reverse Number :- " + rev);
    }
}
