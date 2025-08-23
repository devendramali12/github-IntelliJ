package Practice;

import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number:- ");

        int num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = i * fact;


        }
        System.out.println(fact);
    }
}
