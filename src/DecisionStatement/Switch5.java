package DecisionStatement;

import java.util.Scanner;

//  Calculator using Switch
public class Switch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :- ");
        int a = sc.nextInt();


        System.out.println("Enter 2nd Number :- ");
        int b = sc.nextInt();


        System.out.print("Enter a symbol: ");
        char symbol =sc.next().charAt(0);


        switch (symbol){
            case '+':
                System.out.println("Sum = " +(a+b));
                break;
            case '-':
                System.out.println("Difference = " + (a-b));
                break;
            case'*':
                System.out.println("Product = " + a*b);
                break;
            case '/':
                System.out.println("Quotient = " + (a/b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
