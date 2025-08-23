package Patterns;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Number Of Row:- ");
        int row = sc.nextByte();

        System.out.println("Please Enter the Number Of column:- ");
        int col = sc.nextInt();


        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
