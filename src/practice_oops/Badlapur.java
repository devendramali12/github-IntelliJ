package practice_oops;

class Ambernath {
    static String s = "Shiv Mandir";  // ---> Static Global Variable;
    String str = "Ulhasnagar ke baad ata hu";  // ---> Non-Static Global Variable

    static void clg() {  // ---> Static Method
        System.out.println("Koi Accha Clg Nhi Hai");
    }

    void famous() { // ---> Non-Static Method
        System.out.println("CHM IS Op");
    }
}

public class Badlapur {
    public static void main(String[] args) {
        System.out.println(Ambernath.s);
        System.out.println(new Ambernath().str);

        Ambernath.clg();
        new Ambernath().famous();

        Kalyan.khana();
        System.out.println(Kalyan.niv);

        new Kalyan().petu();
        System.out.println(new Kalyan().name);

    }

}
