package Loops;

// To print odd num from -30 to -80
public class Q7 {
    public static void main(String[] args) {
        for (int i = -30; i >= -80; i--) {
            System.out.print(i + " ");


        }
        System.out.println();
        System.out.println("--------------------------");
        int a = -30;
        while (a >= -80) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println();
        System.out.println("-------------------------------");

        int b = -30;
        do {
            System.out.print(b + " ");
            b--;
        } while (b >= -80);
    }
}
