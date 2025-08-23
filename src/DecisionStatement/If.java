package DecisionStatement;

import java.util.Scanner;

//Check if a number is even or odd
public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter A Number:- ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println( num + " Is a Even Number");
        }else {
            System.out.println(num + " Is a Odd Number");
        }


    }
}
