package ScenarioBasedQuestion;

import java.util.Scanner;

/*
🔐 Scenario 6: Password Strength Validator
Problem Statement:
Create a program that validates the strength of a user-entered password. The password is considered strong if:
It is at least 8 characters long.
It contains at least one uppercase letter.
It contains at least one lowercase letter.
It contains at least one digit.
It contains at least one special character (like @, #, $, %, etc).
👉 Write a program that:
Takes password input from the user.
Checks all conditions listed above.
Displays appropriate message:
If the password is strong: “Password is strong.”
If not, display the missing conditions.
 */
public class PasswordStrengthValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The Password:- ");
        String Password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean isLongEnough = Password.length() >= 8;

        for (char ch : Password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecial = true; {

            }
            if (isLongEnough && hasUpper && hasLower && hasDigit && hasSpecial){
                System.out.println("Password is Strong");
            }else {
                System.out.println("Password is weak ");
            }


        }


    }
}


