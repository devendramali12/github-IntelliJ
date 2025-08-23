package DecisionStatement;

import java.util.Scanner;

//  Grade checker (marks → grade)
public class DecisionStaement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The marks:- ");

        int marks = sc.nextInt();

        if (marks>=90){
            System.out.println("Grade:- A");

        } else if (marks>=75) {
            System.out.println("Grade:- B");
        } else if (marks>=40) {
            System.out.println("Grade:-C ");
        } else {
            System.out.println("Fail");
        }

    }
}
