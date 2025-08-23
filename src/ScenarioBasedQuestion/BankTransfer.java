package ScenarioBasedQuestion;

import java.util.Scanner;

/*
Simple Banking - Transfer Validation
You have ₹25,000 in your account. Ask the user how much they want to transfer.
If the amount is more than available balance or less than ₹1,000, show error.

 */
public class BankTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       final int balance = 25000;

        System.out.println("Please Enter The Amount To Transfer:- ");
        int transfer = sc.nextInt();

        if (transfer > balance || transfer < 1000){
            System.out.println("Error");
        } else {
            int available = balance - transfer;
            System.out.println("Transfer Sucessful");
            System.out.println("Remaining Balance :- " + available);
        }
            sc.close();
    }
}
