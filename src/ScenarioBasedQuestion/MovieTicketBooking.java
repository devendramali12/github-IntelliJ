package ScenarioBasedQuestion;

import java.util.Scanner;

/*
 Movie Ticket Booking
A cinema charges different ticket prices based on age:
Children (age < 12): ₹100
Adults (12 to 60): ₹200
Senior citizens (above 60): ₹150
Write a program that takes a user's age and tells the ticket price.
 */
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Age:- ");
        int age = sc.nextInt();

        if (age < 12) {
            System.out.println("Movie Ticket Is :- 100");
        } else if (age <= 60) {
            System.out.println("Movie Ticket IS :- 200");

        } else {
            System.out.println("Movie Ticket is :- 150");

        }
        sc.close();
    }
}