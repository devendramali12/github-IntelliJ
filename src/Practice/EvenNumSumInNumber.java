package Practice;

import java.util.Scanner;

public class EvenNumSumInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number :-");
        int num = sc.nextInt();

        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            if (last % 2 == 0) {
                sum = sum + last;
            }
            num = num / 10;
        }
        System.out.println("The Sum Of Even Numbers In a Number Is :- " + sum);
    }
}
