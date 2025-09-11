package Oops.Access_Non_Static_Members;

class Rakhi {
    String r = "Zinda Hu";  // ---> Non_Static_Global_Variable

    void kalesh() {
        System.out.println("Kalesh Method");
    }
}

public class ChandraMukhi {
    int a = 44; // ---> Non Static Global Variable

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(new ChandraMukhi().a);
        new ChandraMukhi().hawan();

        System.out.println("--------------------------------------------------");

        System.out.println(new Rakhi().r);
        new Rakhi().kalesh();
        System.out.println("---------------------------------------------------");

        System.out.println(new Basnti().d);
        new Basnti().nachana();
        System.out.println("End");
    }

    void hawan() {  // ---> Non-Static Method
        System.out.println("Hawan Karenge");
    }

}
