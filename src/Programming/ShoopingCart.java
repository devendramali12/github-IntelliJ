package Programming;

import java.util.Scanner;

public class ShoopingCart {
    public static void main(String[] args) {

        System.out.println("Cost Of shoes");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Cost Of shocks");
        int num2 = sc.nextInt();

        System.out.println("Cost Of power bank");
        int num3 = sc.nextInt();

        int sum = num1+num2+num3 ;

        if (sum>=5000)

            System.out.println(" Amount After 15% Discount is " + sum*0.85);
        else
            System.out.println("Amount Without Discount "+sum);





    }
}
