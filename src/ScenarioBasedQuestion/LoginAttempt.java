package ScenarioBasedQuestion;

import java.util.Scanner;

/*
Scenario: A login system allows 3 attempts.
If the user fails to log in in 3 tries, their account is locked.
👉 Question:
Write a program that simulates this login system.
 Use a fixed username and password (e.g., user: admin, pass: 1234).

 */
public class LoginAttempt {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "12345";

        Scanner sc = new Scanner(System.in);

        int attempts = 3;

        while (attempts > 0){
            System.out.printf("Enter username:- ");
            String inputUser = sc.nextLine();

            System.out.println("Enter password:- ");
            String inputPass = sc.nextLine();

            if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD) ){
                System.out.println("Login Sucessful ! Welcome " + inputUser + "!");
            }else {
                attempts--;
                System.out.println("Invalid credentials. Attempts left:- " + attempts);
            }

        }
        System.out.println("Account Locked. Too many failed attempts. ");
    }

}
