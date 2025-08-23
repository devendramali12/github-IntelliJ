package Practice;

import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number to Check Armstrong");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;

        while (num!=0){
            int last  = num % 10;
            sum += last*last *last;
            num = num/10;

        }
        if (sum==temp){
            System.out.println("Is a Armstrong Number");
        }else {
            System.out.println("Isn't a Armstrong Number");
        }

    }
}
