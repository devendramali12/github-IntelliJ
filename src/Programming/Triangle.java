package Programming;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        System.out.println("Entered 1st Angle");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Entered 2st Angle");
        int num2 = sc.nextInt();


        System.out.println("Entered 3st Angle");
        int num3 = sc.nextInt();

        if((num1 > 0 && num1< 180) && (num2>0 && num2<180) && (num3>0 && num3<180))
        {
            if(num1+num2+num3 == 180)
                System.out.println("These can form a triangle");
            else
                System.out.println("These can't Form a triangle");

        }
        else
        System.out.println("Invalid Triangle");
    }
}
