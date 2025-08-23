package Programming;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The number ");

        int a = sc.nextInt();

        if(a>0)
            System.out.println("It is a positive Number");

        else if (a==0)
            System.out.println("It is a Zero");
        else
            System.out.println("It is a Negative Number");

    }
}
