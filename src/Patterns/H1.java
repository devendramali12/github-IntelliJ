package Patterns;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter row");
        int row = sc.nextInt();

        System.out.println("Please Enter Col");
        int col = sc.nextInt();

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                System.out.print("❤️ ");
            }
            System.out.println();
        }
    }
}
