package Practice;

import java.util.Scanner;

public class SumOfNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Please enter a Number:- ");
        int a = sc.nextInt();

        for (int i = 0; i <=a ; i++) {
            sum = i+ sum;

        }
        System.out.println(sum);
    }
}
