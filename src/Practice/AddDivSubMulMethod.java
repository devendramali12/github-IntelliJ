package Practice;

import java.util.Scanner;

public class AddDivSubMulMethod {
    public static int add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 1st num");
        int n1 = sc.nextInt();
        System.out.println("please enter 2nd num");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("Sum is " + sum);
        return sum;

    }

    public static void main(String[] args) {
        add();

       
    }


}

