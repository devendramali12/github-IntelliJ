package Programming;

import java.util.Scanner;

public class Sum2Num {
    public static void main(String[] args) {

        System.out.println("Enter 1st Num");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd num");
        Scanner s = new Scanner(System.in);
        int num2 = sc.nextInt();

        int summ = num1+num2;

        if(summ>=100)
            System.out.println("its huge number");
        else
            System.out.println("Its small number");

    }
}
