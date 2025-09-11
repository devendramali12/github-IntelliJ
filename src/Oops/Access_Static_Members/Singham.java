package Oops.Access_Static_Members;

// Different class Same Source File


class Simba {
    static int i = 20;   //  ---> Static Global Variable

    public static void fight() {  // ---> Static Method
        System.out.println("Gun Fight");
    }
}

public class Singham {
    // Same Class Same Source File

    static String s = "Kareena";

    public static void dance() {
        System.out.println("Fevicol Se .........");
    }

    public static void main(String[] args) {
        System.out.println("Singham Start");
        System.out.println(Simba.i);
        Simba.fight();
        System.out.println("----------------------------------------------------------");

        // Static Members Can Be Accessed directly if it is present in sameclass
        System.out.println(s);
        dance();

        System.out.println("----------------------------------------");

        System.out.println(Golmaal.s);
        Golmaal.ungliTod();
        System.out.println("Singham End");
    }
}
