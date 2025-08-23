package ScenarioBasedQuestion;

import java.util.Scanner;

/*
Simple Shopping Cart System
👉 Problem Statement:
Create a console-based shopping cart system where:
A list of 5 products with their prices is displayed.
The user can select items by entering the product number and quantity.
The user can continue adding items until they choose to check out.
At checkout, display:
List of items purchased
Quantity of each
Total bill
 */
public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String [] products = {"pen","Notebook","Eraser","marker"};
       int [] prices = {10,50,5,3,25};
       int [] quantities = new int[5];

       boolean shooping = true ;

       while (shooping){
           System.out.println("\n---Available Products---");
           for (int i = 0; i <products.length ; i++) {
               System.out.println((i+1) + ". " + products[i] +  prices[i] );

           }
           System.out.println("Enter product number to add to cart:- ");
           int prodcutNumber = sc.nextInt();

           if (prodcutNumber <1 || prodcutNumber>5){
               System.out.println("Invalid product number ");
               continue;
           }
           System.out.println("Enter quantity: ");
           int qty = sc.nextInt();
           quantities[prodcutNumber - 1] += qty;

           System.out.println("Do you want to add more items? (yes/no): ");
           sc.nextLine();
           String choice = sc.nextLine();
           shooping = choice.equalsIgnoreCase("yes");
       }
        System.out.println("\n---Bill Summary---");
       int total = 0;
        for (int i = 0; i <products.length ; i++) {
            if (quantities[i] > 0){
                int itemTotal = prices[i] *quantities[i];
                total+= itemTotal;
                System.out.println(products[i] + " x " + quantities[i] + itemTotal);
            }

        }
        System.out.println("Total Bill:- " + total);
        sc.close();


    }
}
