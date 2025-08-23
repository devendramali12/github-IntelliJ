package Loops;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number To Get The Sum");

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
        sc.close();

    }
}
