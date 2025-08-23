package TypeCasting;

public class NarrowingExample {
    public static void main(String[] args) {
        double x =95.85;
        float f = (float) x;
        int i = (int)f;
        short s =(short) i;

        double b = 85.69;
        int a=(int)b;

        System.out.println(a);

        System.out.println("Double:- " + x);
        System.out.println("Float:- " + f);
        System.out.println("int:- "+i);
        System.out.println("Short:- " +s);
    }
}
