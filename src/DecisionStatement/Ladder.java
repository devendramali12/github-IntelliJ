package DecisionStatement;

import java.util.Scanner;

//Check if a number is positive, negative, or zero
public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number:- ");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Its a Positive Number");
        } else if (num<0) {
            System.out.println("Its a Negative Number");

        }else {
            System.out.println("Its a Zero Number");
        }

    }


}
