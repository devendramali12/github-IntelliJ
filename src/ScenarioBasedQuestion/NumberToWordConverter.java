package ScenarioBasedQuestion;

import java.util.Scanner;

/*
Number to Word Converter
Take a single-digit number (0–9) from the user and
print it in words (e.g., 0 → "Zero", 1 → "One", etc.).
 */
public class NumberToWordConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digit from 0-9 :- ");
        int digit = sc.nextInt();

        switch (digit){
            case 0 :
                System.out.println("Zero");
                break;
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Five");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8 :
                System.out.println("Eight");
                break;
            case 9 :
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid Input Please a number between 0-9!!!");
        }
        sc.close();

    }
}
