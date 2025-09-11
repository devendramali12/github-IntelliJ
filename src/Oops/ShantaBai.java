package Oops;
// Accesising Local & Global Variable

public class ShantaBai {
    static int n = 420;  // ---> Static Global Variable
    String s = "Lala";  // ---> Non Static Global Variable

    public static void main(String[] args) {
        System.out.println("S Start");
        String s = "BabuRao";  // ---> Local Variable
        int n = 789;  // ---> Local Variable

        // Accessing Local Variable
        System.out.println(s);
        System.out.println(n);

        System.out.println("--------------------");

        // Accessing Global Variable
        System.out.println(new ShantaBai().n);
        System.out.println(new ShantaBai().s);
        System.out.println("End");
    }
}
