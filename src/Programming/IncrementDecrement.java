package Programming;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a++;
        b++;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------------------------------------------");
        ++a;
        ++b;
        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------------------------");

        int m = 25;
        int n = 45;
        --m;
        --n;
        int j = m++;
        System.out.println(j);
        System.out.println(m);
        System.out.println(n);
        System.out.println("----------------------------------------------------------------");
        m--;
        n--;
        System.out.println(m);
        System.out.println(n);

    }
}
