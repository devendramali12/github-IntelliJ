package Practice;

import java.util.Scanner;

public class SumOfEvenNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number :- ");
        int num = sc.nextInt();

        int sum = 0;


        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("Sum Of Even Number Upto " + num + " Is " + sum);
    }
}
