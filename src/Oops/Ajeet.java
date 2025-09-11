package Oops;


class Anjali {
    static String s = "Anju";   //  ---> Static Global Variable
    static int n = 19;          //  ---> Static Global Variable

    static void love() {
        System.out.println("Aashique...");

    }


}

public class Ajeet {
    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println(Anjali.s);
        System.out.println(Anjali.n);
        Anjali.love();

        System.out.println("Main End");

    }

}
