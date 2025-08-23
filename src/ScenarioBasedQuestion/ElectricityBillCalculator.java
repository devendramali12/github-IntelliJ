package ScenarioBasedQuestion;

import java.util.Scanner;

/*
 Electricity Bill Calculator
Create a program that calculates the total electricity bill based on units consumed:
First 100 units: ₹5/unit
Next 100 units: ₹7/unit
Above 200 units: ₹10/unit
 */
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the units consumed:- ");
        double units = sc.nextDouble();
        double bill = 0;

        if (units <= 100){
            bill = units * 5;

        } else if (units <=200){
            bill = (100*5) + ((units - 100)*7);
        }else {
            bill = (100*5) + (100*7)+((units - 200)*10);
        }
        System.out.println("Total Electricity Bills:- " + bill);
        sc.close();
    }
}
