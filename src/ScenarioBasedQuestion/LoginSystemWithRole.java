package ScenarioBasedQuestion;

import java.util.Scanner;

/*
Login System with Role
Create a system where:
User enters username and password.
Also selects a role: Admin, Customer, or Guest.
If all credentials are correct, greet based on role.
 */
public class LoginSystemWithRole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        final String Username = "devendra";
        final String Password = "1234";

        System.out.println("Enter Your Username");
        String username = sc.nextLine();

        System.out.println("Enter Your Password");
        String password = sc.nextLine();

        System.out.println("Please Select Your Role:-");
        System.out.println("1:- Admin");
        System.out.println("2:- Customer");
        System.out.println("3:- Guest");

        int role = sc.nextInt();

        if (username.equals (Username) && password.equals(Password) ) {
            switch (role) {
                case 1:
                    System.out.println("Welcome Admin!!!");
                    break;
                case 2:
                    System.out.println("Welcome Customer!!!");
                    break;
                case 3:
                    System.out.println("Welcome Guest!!!");
                    break;
                default:
                    System.out.println("Invalid Role Selected");
            }


        }else {
            System.out.println("Invalid Login.Please check your credentials");
        }
    }
}