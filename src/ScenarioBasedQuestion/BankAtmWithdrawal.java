package ScenarioBasedQuestion;

import java.util.Scanner;

/*
🔹 2. Bank ATM Withdrawal
Scenario: A user is trying to withdraw cash from an ATM.
 The ATM has denominations of ₹2000, ₹500, and ₹100 notes only.
👉 Question:
Write a program that takes the withdrawal amount and returns
 how many notes of each denomination will be given to the user.
 */
public class BankAtmWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Ammout to Withdraw:-");
        int withdraw = sc.nextInt();

        if (withdraw % 100 !=0){
            System.out.println("Ammount must be in multiples of 100. ");
            return;



        }
        int note2000 = withdraw / 2000;
        withdraw = withdraw % 2000;

        int note500 = withdraw /500;
        withdraw = withdraw % 500;

        int note100 = withdraw/100;

        System.out.println("\n---Denomination---");
        System.out.println("2000 Notes :- " + note2000);
        System.out.println("500 Notes  :- " + note500);
        System.out.println("100 Notes  :- " + note100);

    }
}
