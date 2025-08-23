package ScenarioBasedQuestion;

import java.util.Scanner;

/*
ATM PIN Authentication System
👉 Problem Statement:
Create a simple ATM system where a user is required to enter a 4-digit PIN. The user has only 3 attempts to enter the correct PIN.
If the correct PIN is entered, show:
"Access granted. Welcome!"
If the wrong PIN is entered:
Show: "Incorrect PIN. Try again."
After 3 incorrect attempts, show:
"Account locked. Too many incorrect attempts."
and exit the program.
 */
public class AtmPin {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 3;
        Scanner sc = new Scanner(System.in);

        while (attempts>0){
            System.out.println("Enter your 4-digit PIN:- ");
            int enteredpin = sc.nextInt();

            if (enteredpin == CORRECT_PIN){
                System.out.println("Access granted Welcome!!");
                break;
            }else {
                attempts--;
                if (attempts == 0){
                    System.out.println("Account locked.Too many incorrect attempt");
                } else {
                    System.out.println("Incorrect pin, attempts left:- " + attempts );
                }
            }
        }

    }
}
