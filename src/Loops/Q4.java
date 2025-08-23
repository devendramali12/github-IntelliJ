package Loops;

import java.util.Scanner;

// To Print table of any number using Scanner Input
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number :-");
        int a = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(a+ "X" + i +"=" + (a*i));

        }
        System.out.println("----------------------------------");
        int b = 1;
        while (b<=10){
            System.out.println(a*b);
            b++;
        }
        System.out.println("---------------------");
        int c = 1;
        do {
            System.out.println(a*c);
            c++;
        }while (c<=10);

    }
}
