package ScenarioBasedQuestion;

import java.util.Scanner;

/*
Scenario: In a college, you need to write a program to
 accept marks of 5 subjects and print:
Total Marks
Average
Result (Pass/Fail, Pass if each subject is ≥ 35)
Grade (A: ≥80, B: ≥60, C: ≥50, D: ≥35, F: <35)
👉 Question:
Write a program that inputs student name, marks of 5 subjects, and displays result summary.
 */
public class StudentResultManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Student Name:- ");
        String Name = sc.nextLine();

        System.out.println(" Enter The Marks Of 5 Subjects:- ");

        System.out.print("Marathi:- ");
        int Marathi = sc.nextInt();

        System.out.print("Maths:- ");
        int Maths = sc.nextInt();

        System.out.print("Science:- ");
        int Science = sc.nextInt();

        System.out.print("English:- ");
        int English = sc.nextInt();

        System.out.print("Hindi:- ");
        int Hindi = sc.nextInt();


        int total = Marathi + Maths + Science + English + Hindi / 100;
        double average = total / 5.0;

        System.out.println("\n ----- Result Summary -----");
        System.out.println("Student Name:- " + Name);
        System.out.println("Total Marks:- " + total);
        System.out.printf("Average:- %2f\n", average);

        if (Marathi >= 35 && Maths >= 35 && Science >= 35 && English >= 35 && Hindi >= 35) {
            System.out.println("Result:- Passed ");

            if (average>=80){
                System.out.println("Grade:- A ");
            } else if (average >= 60) {
                System.out.println("Grade:- B");

            }else if (average >= 50){
                System.out.println("Grade:- C");
            } else if (average>=35) {
                System.out.println("Grade:- D");

            }

        }else {
            System.out.println("Result :- Failed");
            System.out.println("Grade :- F");
        }

    }
}
