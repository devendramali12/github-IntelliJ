package Programming;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Name:-");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You are eligible to vote!!");
        }else {
            System.out.println("You are underage");
        }

    }
}
