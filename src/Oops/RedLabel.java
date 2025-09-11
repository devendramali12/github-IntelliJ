package Oops;

public class RedLabel {
    static String color = "Red";  // Static Global Variable
    int price = 150;  // Non Static Global Variable

    public static void drink() { // Static Method
        System.out.println("Drinking Whiskey");

    }

    public static void main(String[] args) {
        System.out.println("Main Start");

        int num = 10;  // Local Var

        System.out.println("Main End");
    }

    public void dance() {
        // Non-Static Method
        System.out.println("Break Dance....");
    }
}
