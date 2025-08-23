package DecisionStatement;
// Check if person is eligible to vote and is a citizen

import java.util.Scanner;

public class DecisionStatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age:- ");
        int age = sc.nextInt();
        boolean isCitizen = true;

        if (age >= 18) {
            if (isCitizen) {
                System.out.println("You are Eligible to vote");
            } else {
                System.out.println("Not a citizen");
            }
            }else{
                System.out.println("Underage");
            }
        }

    }
