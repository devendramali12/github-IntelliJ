package MethodtTypes.Typee2;

//Print Range
//Accept two numbers start and end, print all numbers between them.
public class Type3Example3 {
    public static void range(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        range(5, 10);


    }
}
