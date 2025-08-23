package MethodtTypes.Typee4;

//Calculate Factorial
//Accept a number, return its factorial.
public class Type4Example2 {
    public static int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial is " + fact);
        return fact;
    }

    public static void main(String[] args) {
        fact(5);

    }
}
