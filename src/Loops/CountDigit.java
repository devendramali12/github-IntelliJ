package Loops;

import java.util.Scanner;

// Count the number of digits in a given number.
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:-");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Number Of Digits " + count);
        sc.close();
    }
}
