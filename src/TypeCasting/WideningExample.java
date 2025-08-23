package TypeCasting;

public class WideningExample {
    public static void main(String[] args) {
        int a = 100;
        long b = a;
        float c = b;
        double d = c;

        System.out.println("Int:- " + a);
        System.out.println("Long:- "+b);
        System.out.println("Float:- "+ c);
        System.out.println("Double:- " +d);
    }
}
