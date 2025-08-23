package ScenarioBasedQuestion;

import java.util.Scanner;

/*
4. Online Order Billing System
Scenario: An online food delivery platform charges:
₹50 delivery fee if order < ₹500
No delivery fee if order ≥ ₹500
GST 5% on the total
👉 Question:
Write a program to accept order amount, calculate delivery fee, GST, and total payable amount.
 */
public class OnlineOrderBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the order Amount:- ");
        int orderAmount = sc.nextInt();

        int deliveryfee = 0;
        double gst ;
        double payableAmount;

        if (orderAmount<500){
            deliveryfee=50;
        }

        int baseAmount = orderAmount+deliveryfee;
        gst = 0.05 * baseAmount;
        payableAmount = baseAmount + gst;

        System.out.println("\n----- Bill Summary -----");
        System.out.printf("Order Amount  :%.2f\n",(double)orderAmount);
        System.out.printf("Delivery Fee :%d\n",deliveryfee);
        System.out.printf("Subtotal : %d\n",baseAmount);
        System.out.printf("Gst (5%%) : %.2f\n",gst);
        System.out.printf("Total payable: %.2f\n",payableAmount);

    }
}
