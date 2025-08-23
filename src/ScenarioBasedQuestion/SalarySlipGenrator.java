package ScenarioBasedQuestion;

import java.util.Scanner;

/*
1. Employee Salary Slip Generator
Scenario: You are asked to create a small module in an HR system that calculates the monthly salary
of an employee after considering basic salary, HRA (20%), and deductions (PF 12%, tax 10%).

👉 Question:
Write a program that accepts the basic salary and employee name,
 and prints the total salary after applying HRA and deductions.

 */
public class SalarySlipGenrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Employee Name:- ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary:- ");
        double basicsalary = sc.nextDouble();

        // calculation
        double hra = 0.20 * basicsalary;
        double pf = 0.12* basicsalary;
        double tax = 0.10 * basicsalary;

        double grossSalary = basicsalary + hra;
        double totaldeduction = pf + tax;
        double netSalary =grossSalary - totaldeduction;

        // output
        System.out.println("==========Salary Slip=========");
        System.out.println("Employee Name:- " +name);
        System.out.println("Basic Salary:- " + basicsalary);
        System.out.println("HRA:- "+hra);
        System.out.println("PF Deduction:- "+pf);
        System.out.println("Tax deduction:-"+tax);
        System.out.println("Gross Salary:- " + grossSalary);
        System.out.println("Total Deduction:- " + totaldeduction);
        System.out.println("Net Salary:- " + netSalary);
        System.out.println("==================================");


    }
}
