package Programming;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
       int n1 = 0;
       int n2 = 1;
        int temp = 10;

        System.out.print(n1+" "+n2+" ");

        for (int i = 3; i <=temp ; i++) {
            int n3 = n1+n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;

        }

    }
}
