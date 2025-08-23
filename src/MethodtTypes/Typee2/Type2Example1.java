package MethodtTypes.Typee2;

public class Type2Example1 {
    public static void checkeligible(int age) {


        if (age < 18) {
            System.out.println("Not Eligible For Voting");
        } else if (age >= 18) {
            System.out.println("Eligible For Voting");
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        checkeligible(12);
        checkeligible(55);
        checkeligible(0);
        checkeligible(-63);

    }
}
